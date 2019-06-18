package com.example.publisherapi;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Component
public class PublisherComponent {

	@Value("${publisher.uri}")
	private String url;
	
	@Value("${publisher.init}")
	private Boolean isInit;
	
	@Autowired
	PublisherRepository publishRepository;
	
	@PostConstruct
	public void init() {
		if (isInit)
			this.downloadPublisherInfo();
	}
	
	public int downloadPublisherInfo() {
				
		CloseableHttpClient httpClient
	      = HttpClients.custom()
	        .setSSLHostnameVerifier(new NoopHostnameVerifier())
	        .build();
	    HttpComponentsClientHttpRequestFactory requestFactory
	      = new HttpComponentsClientHttpRequestFactory();
	    requestFactory.setHttpClient(httpClient);
		
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		String result = restTemplate.getForObject(url, String.class, new HashMap<>());
		
		List<String> lines = Arrays.asList(result.split("\n"));
//		List<String> lines2 = Arrays.asList(result.split("^((\"(?:[^\"]|\"\")*\"|[^,]*)(,(\"(?:[^\"]|\"\")*\"|[^,]*))*)$"));
		
		int i = 0;
		for (String line : lines) {
			i++;
			if (i == 1)
				continue;
			
			if (i == 502)
				break;
			
			List<String> fields = Arrays.asList(line.split(","));
			
			// parse info
			List<String> finalFields = new ArrayList<String>();
			
			boolean quoteFound = false;
			String tmpField = "";
			for (String field : fields) {
				if (!field.contains("\"") && !quoteFound) {
					finalFields.add(field);
					continue;
				} else {
					quoteFound = !quoteFound;
					tmpField += "," + field;
					
					if (!quoteFound) {
						finalFields.add(tmpField.substring(1).replaceAll("\"", ""));
						tmpField = "";
						continue;
					}
				}
			}

			Publisher publisher = new Publisher(finalFields.get(0), finalFields.get(1), finalFields.get(2), finalFields.get(3), 
					finalFields.get(4), finalFields.get(5), finalFields.get(6), finalFields.get(7), finalFields.get(8), 
					finalFields.get(9), finalFields.get(10), finalFields.get(11), finalFields.get(12));
			
			publishRepository.save(publisher);
		}
		
		return lines.size()-1;
	}
	
}
