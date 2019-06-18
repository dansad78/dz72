package com.example.publisherapi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Publisher {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "amazon_revenue")
	private String amazonRevenue;
	
	@Column(name = "author_revenue")
	private String authorRevenue;
	
	@Column(name = "average_rating")
	private String averageRating;
	
	@Column(name = "genre")
	private String genre;

	@Column(name = "gross_sales")
	private String grossSales;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "publisher_revenue")
	private String publisherRevenue;
	
	@Column(name = "sale_price")
	private String salePrice;
	
	@Column(name = "sales_rank")
	private String salesRank;
	
	@Column(name = "sold_by")
	private String soldBy;
	
	@Column(name = "total_reviews")
	private String totalReviews;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "units_sold")
	private String unitsSold;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAmazonRevenue() {
		return amazonRevenue;
	}

	public void setAmazonRevenue(String amazonRevenue) {
		this.amazonRevenue = amazonRevenue;
	}

	public String getAuthorRevenue() {
		return authorRevenue;
	}

	public void setAuthorRevenue(String authorRevenue) {
		this.authorRevenue = authorRevenue;
	}

	public String getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(String averageRating) {
		this.averageRating = averageRating;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(String grossSales) {
		this.grossSales = grossSales;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisherRevenue() {
		return publisherRevenue;
	}

	public void setPublisherRevenue(String publisherRevenue) {
		this.publisherRevenue = publisherRevenue;
	}

	public String getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getSalesRank() {
		return salesRank;
	}

	public void setSalesRank(String salesRank) {
		this.salesRank = salesRank;
	}

	public String getSoldBy() {
		return soldBy;
	}

	public void setSoldBy(String soldBy) {
		this.soldBy = soldBy;
	}

	public String getTotalReviews() {
		return totalReviews;
	}

	public void setTotalReviews(String totalReviews) {
		this.totalReviews = totalReviews;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUnitsSold() {
		return unitsSold;
	}

	public void setUnitsSold(String unitsSold) {
		this.unitsSold = unitsSold;
	}

	public Publisher(String amazonRevenue, String authorRevenue, String averageRating, String genre, String grossSales,
			String name, String publisherRevenue, String salePrice, String salesRank, String soldBy,
			String totalReviews, String type, String unitsSold) {
		super();
		this.amazonRevenue = amazonRevenue;
		this.authorRevenue = authorRevenue;
		this.averageRating = averageRating;
		this.genre = genre;
		this.grossSales = grossSales;
		this.name = name;
		this.publisherRevenue = publisherRevenue;
		this.salePrice = salePrice;
		this.salesRank = salesRank;
		this.soldBy = soldBy;
		this.totalReviews = totalReviews;
		this.type = type;
		this.unitsSold = unitsSold;
	}

	public Publisher() {
		super();
	}

	
}
