package com.example.batch.model;

import javax.persistence.*;

@Entity(name = "train")
public class Train {

    @Id
    @SequenceGenerator(name = "mln", allocationSize = 2000000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mln")
    private Long id;
    //    date_time 	Timestamp 	string
    private String date_time;
    //    site_name 	ID of the Expedia point of sale (i.e. Expedia.com, Expedia.co.uk, Expedia.co.jp, ...) 	int
    private Integer site_name;
    //    posa_continent 	ID of continent associated with site_name 	int
    private Integer posa_continent;
    //    user_location_country 	The ID of the country the customer is located 	int
    private Integer user_location_country;
    //    user_location_region 	The ID of the region the customer is located 	int
    private Integer user_location_region;
    //    user_location_city 	The ID of the city the customer is located 	int
    private Integer user_location_city;
    //    orig_destination_distance 	Physical distance between a hotel and a customer at the time of search. A null means the distance could not be calculated 	double
    private Double orig_destination_distance;
    //    user_id 	ID of user 	int
    private Integer user_id;
    //    is_mobile 	1 when a user connected from a mobile device, 0 otherwise 	tinyint
    private Integer is_mobile;
    //    is_package 	1 if the click/booking was generated as a part of a package (i.e. combined with a flight), 0 otherwise 	int
    private Integer is_package;
    //    channel 	ID of a marketing channel 	int
    private Integer channel;
    //    srch_ci 	Checkin date 	string
    private String srch_ci;
    //    srch_co 	Checkout date 	string
    private String srch_co;
    //    srch_adults_cnt 	The number of adults specified in the hotel room 	int
    private Integer srch_adults_cnt;
    //    srch_children_cnt 	The number of (extra occupancy) children specified in the hotel room 	int
    private Integer srch_children_cnt;
    //    srch_rm_cnt 	The number of hotel rooms specified in the search 	int
    private Integer srch_rm_cnt;
    //    srch_destination_id 	ID of the destination where the hotel search was performed 	int
    private Integer srch_destination_id;
    //    srch_destination_type_id 	Type of destination 	int
    private Integer srch_destination_type_id;
    //    hotel_continent 	Hotel continent 	int
    private Integer hotel_continent;
    //    hotel_country 	Hotel country 	int
    private Integer hotel_country;
    //    hotel_market 	Hotel market 	int
    private Integer hotel_market;
    //    is_booking 	1 if a booking, 0 if a click 	tinyint
    private Integer is_booking;
    //    cnt 	Numer of similar events in the context of the same user session 	bigint
    private Long cnt;
    //    hotel_cluster 	ID of a hotel cluster 	int
    private Integer hotel_cluster;

    public Train() {
    }

    public Train(String date_time, Integer site_name, Integer posa_continent, Integer user_location_country,
                 Integer user_location_region, Integer user_location_city, String orig_destination_distance,
                 Integer user_id, Integer is_mobile, Integer is_package, Integer channel, String srch_ci,
                 String srch_co, Integer srch_adults_cnt, Integer srch_children_cnt, Integer srch_rm_cnt,
                 Integer srch_destination_id, Integer srch_destination_type_id, Integer hotel_continent,
                 Integer hotel_country, Integer hotel_market, Integer is_booking, Long cnt, Integer hotel_cluster) {
        this.date_time = date_time;
        this.site_name = site_name;
        this.posa_continent = posa_continent;
        this.user_location_country = user_location_country;
        this.user_location_region = user_location_region;
        this.user_location_city = user_location_city;
        this.orig_destination_distance = !"".equals(orig_destination_distance) ? Double.parseDouble(orig_destination_distance) : 0D;
        this.user_id = user_id;
        this.is_mobile = is_mobile;
        this.is_package = is_package;
        this.channel = channel;
        this.srch_ci = srch_ci;
        this.srch_co = srch_co;
        this.srch_adults_cnt = srch_adults_cnt;
        this.srch_children_cnt = srch_children_cnt;
        this.srch_rm_cnt = srch_rm_cnt;
        this.srch_destination_id = srch_destination_id;
        this.srch_destination_type_id = srch_destination_type_id;
        this.hotel_continent = hotel_continent;
        this.hotel_country = hotel_country;
        this.hotel_market = hotel_market;
        this.is_booking = is_booking;
        this.cnt = cnt;
        this.hotel_cluster = hotel_cluster;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public Integer getSite_name() {
        return site_name;
    }

    public void setSite_name(Integer site_name) {
        this.site_name = site_name;
    }

    public Integer getPosa_continent() {
        return posa_continent;
    }

    public void setPosa_continent(Integer posa_continent) {
        this.posa_continent = posa_continent;
    }

    public Integer getUser_location_country() {
        return user_location_country;
    }

    public void setUser_location_country(Integer user_location_country) {
        this.user_location_country = user_location_country;
    }

    public Integer getUser_location_region() {
        return user_location_region;
    }

    public void setUser_location_region(Integer user_location_region) {
        this.user_location_region = user_location_region;
    }

    public Integer getUser_location_city() {
        return user_location_city;
    }

    public void setUser_location_city(Integer user_location_city) {
        this.user_location_city = user_location_city;
    }

    public Double getOrig_destination_distance() {
        return orig_destination_distance;
    }

    public void setOrig_destination_distance(Double orig_destination_distance) {
        this.orig_destination_distance = orig_destination_distance;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getIs_mobile() {
        return is_mobile;
    }

    public void setIs_mobile(Integer is_mobile) {
        this.is_mobile = is_mobile;
    }

    public Integer getIs_package() {
        return is_package;
    }

    public void setIs_package(Integer is_package) {
        this.is_package = is_package;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getSrch_ci() {
        return srch_ci;
    }

    public void setSrch_ci(String srch_ci) {
        this.srch_ci = srch_ci;
    }

    public String getSrch_co() {
        return srch_co;
    }

    public void setSrch_co(String srch_co) {
        this.srch_co = srch_co;
    }

    public Integer getSrch_adults_cnt() {
        return srch_adults_cnt;
    }

    public void setSrch_adults_cnt(Integer srch_adults_cnt) {
        this.srch_adults_cnt = srch_adults_cnt;
    }

    public Integer getSrch_children_cnt() {
        return srch_children_cnt;
    }

    public void setSrch_children_cnt(Integer srch_children_cnt) {
        this.srch_children_cnt = srch_children_cnt;
    }

    public Integer getSrch_rm_cnt() {
        return srch_rm_cnt;
    }

    public void setSrch_rm_cnt(Integer srch_rm_cnt) {
        this.srch_rm_cnt = srch_rm_cnt;
    }

    public Integer getSrch_destination_id() {
        return srch_destination_id;
    }

    public void setSrch_destination_id(Integer srch_destination_id) {
        this.srch_destination_id = srch_destination_id;
    }

    public Integer getSrch_destination_type_id() {
        return srch_destination_type_id;
    }

    public void setSrch_destination_type_id(Integer srch_destination_type_id) {
        this.srch_destination_type_id = srch_destination_type_id;
    }

    public Integer getHotel_continent() {
        return hotel_continent;
    }

    public void setHotel_continent(Integer hotel_continent) {
        this.hotel_continent = hotel_continent;
    }

    public Integer getHotel_country() {
        return hotel_country;
    }

    public void setHotel_country(Integer hotel_country) {
        this.hotel_country = hotel_country;
    }

    public Integer getHotel_market() {
        return hotel_market;
    }

    public void setHotel_market(Integer hotel_market) {
        this.hotel_market = hotel_market;
    }

    public Integer getIs_booking() {
        return is_booking;
    }

    public void setIs_booking(Integer is_booking) {
        this.is_booking = is_booking;
    }

    public Long getCnt() {
        return cnt;
    }

    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    public Integer getHotel_cluster() {
        return hotel_cluster;
    }

    public void setHotel_cluster(Integer hotel_cluster) {
        this.hotel_cluster = hotel_cluster;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", date_time='" + date_time + '\'' +
                ", site_name=" + site_name +
                ", posa_continent=" + posa_continent +
                ", user_location_country=" + user_location_country +
                ", user_location_region=" + user_location_region +
                ", user_location_city=" + user_location_city +
                ", orig_destination_distance=" + orig_destination_distance +
                ", user_id=" + user_id +
                ", is_mobile=" + is_mobile +
                ", is_package=" + is_package +
                ", channel=" + channel +
                ", srch_ci='" + srch_ci + '\'' +
                ", srch_co='" + srch_co + '\'' +
                ", srch_adults_cnt=" + srch_adults_cnt +
                ", srch_children_cnt=" + srch_children_cnt +
                ", srch_rm_cnt=" + srch_rm_cnt +
                ", srch_destination_id=" + srch_destination_id +
                ", srch_destination_type_id=" + srch_destination_type_id +
                ", hotel_continent=" + hotel_continent +
                ", hotel_country=" + hotel_country +
                ", hotel_market=" + hotel_market +
                ", is_booking=" + is_booking +
                ", cnt=" + cnt +
                ", hotel_cluster=" + hotel_cluster +
                '}';
    }
}
