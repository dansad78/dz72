package com.example.feign;

public class Publisher {


	private int id;
	private String amazonRevenue;
	private String authorRevenue;
	private String averageRating;
	private String genre;
	private String grossSales;
	private String name;
	private String publisherRevenue;
	private String salePrice;
	private String salesRank;
	private String soldBy;
	private String totalReviews;
	private String type;
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
