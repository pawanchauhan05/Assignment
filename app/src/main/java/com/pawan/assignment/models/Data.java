package com.pawan.assignment.models;

import com.pawan.assignment.models.Score;

import java.util.Arrays;

/**
 * Created by Pawan Singh Chauhan on 4/11/2017.
 */
public class Data {
    private String parking;
    private String secondaryTitle;
    private long dateOnly;
    private String buildingName;
    private int deposit;
    private String location;
    private String street;
    private Score score;
    private String parkingDesc;
    private boolean forLease;
    private String type;
    private int bathroom;
    private String city;
    private int pinCode;
    private boolean photoAvailable;
    private int totalFloor;
    private String description;
    private int propertySize;
    private String accomodationTypeDesc;
    private String shortUrl;
    private float longitude;
    private boolean gym;
    private boolean sharedAccomodation;
    private boolean shortlistedByLoggedInUser;
    private String propertyTitle;
    private String ownerName;
    private String furnishing;
    private int balconies;
    private int propertyAge;
    private int cupBoard;
    private String powerBackup;
    private boolean accurateLocation;
    private String adminEvent;
    private String managed;
    private int floor;
    private AmenitiesMap amenitiesMap;
    private boolean swimmingPool;
    private boolean lift;
    private long availableFrom;
    private boolean active;
    private String buildingType;
    private String localityId;
    private float latitude;
    private float weight;
    private String ownerId;
    private boolean loanAvailable;
    private boolean negotiable;
    private long activationDate;
    private String id;
    private String title;
    private String facingDesc;
    private String propertyCode;
    private int rent;
    private String buildingId;
    private String builderName;
    private String detailUrl;
    private String furnishingDesc;
    private Object amenities;
    private String society;
    private String accomodationType;
    private String tenantTypeDesc;
    private String typeDesc;
    private String leaseType;
    private long lastUpdateDate;
    private Photos[] photos;
    private long creationDate;
    private String waterSupply;
    private String propertyType;
    private String inactiveReason;
    private String facing;
    private String locality;
    private String nbLocality;
    private boolean sponsored;

    public Data(String city, String description, String title, int rent, String accomodationType) {
        this.city = city;
        this.description = description;
        this.title = title;
        this.rent = rent;
        this.accomodationType = accomodationType;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public String getSecondaryTitle() {
        return secondaryTitle;
    }

    public void setSecondaryTitle(String secondaryTitle) {
        this.secondaryTitle = secondaryTitle;
    }

    public long getDateOnly() {
        return dateOnly;
    }

    public void setDateOnly(long dateOnly) {
        this.dateOnly = dateOnly;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public String getParkingDesc() {
        return parkingDesc;
    }

    public void setParkingDesc(String parkingDesc) {
        this.parkingDesc = parkingDesc;
    }

    public boolean isForLease() {
        return forLease;
    }

    public void setForLease(boolean forLease) {
        this.forLease = forLease;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public boolean isPhotoAvailable() {
        return photoAvailable;
    }

    public void setPhotoAvailable(boolean photoAvailable) {
        this.photoAvailable = photoAvailable;
    }

    public int getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(int totalFloor) {
        this.totalFloor = totalFloor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(int propertySize) {
        this.propertySize = propertySize;
    }

    public String getAccomodationTypeDesc() {
        return accomodationTypeDesc;
    }

    public void setAccomodationTypeDesc(String accomodationTypeDesc) {
        this.accomodationTypeDesc = accomodationTypeDesc;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public boolean isSharedAccomodation() {
        return sharedAccomodation;
    }

    public void setSharedAccomodation(boolean sharedAccomodation) {
        this.sharedAccomodation = sharedAccomodation;
    }

    public boolean isShortlistedByLoggedInUser() {
        return shortlistedByLoggedInUser;
    }

    public void setShortlistedByLoggedInUser(boolean shortlistedByLoggedInUser) {
        this.shortlistedByLoggedInUser = shortlistedByLoggedInUser;
    }

    public String getPropertyTitle() {
        return propertyTitle;
    }

    public void setPropertyTitle(String propertyTitle) {
        this.propertyTitle = propertyTitle;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getFurnishing() {
        return furnishing;
    }

    public void setFurnishing(String furnishing) {
        this.furnishing = furnishing;
    }

    public int getBalconies() {
        return balconies;
    }

    public void setBalconies(int balconies) {
        this.balconies = balconies;
    }

    public int getPropertyAge() {
        return propertyAge;
    }

    public void setPropertyAge(int propertyAge) {
        this.propertyAge = propertyAge;
    }

    public int getCupBoard() {
        return cupBoard;
    }

    public void setCupBoard(int cupBoard) {
        this.cupBoard = cupBoard;
    }

    public String getPowerBackup() {
        return powerBackup;
    }

    public void setPowerBackup(String powerBackup) {
        this.powerBackup = powerBackup;
    }

    public boolean isAccurateLocation() {
        return accurateLocation;
    }

    public void setAccurateLocation(boolean accurateLocation) {
        this.accurateLocation = accurateLocation;
    }

    public String getAdminEvent() {
        return adminEvent;
    }

    public void setAdminEvent(String adminEvent) {
        this.adminEvent = adminEvent;
    }

    public String getManaged() {
        return managed;
    }

    public void setManaged(String managed) {
        this.managed = managed;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public AmenitiesMap getAmenitiesMap() {
        return amenitiesMap;
    }

    public void setAmenitiesMap(AmenitiesMap amenitiesMap) {
        this.amenitiesMap = amenitiesMap;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public boolean isLift() {
        return lift;
    }

    public void setLift(boolean lift) {
        this.lift = lift;
    }

    public long getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(long availableFrom) {
        this.availableFrom = availableFrom;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getLocalityId() {
        return localityId;
    }

    public void setLocalityId(String localityId) {
        this.localityId = localityId;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public boolean isLoanAvailable() {
        return loanAvailable;
    }

    public void setLoanAvailable(boolean loanAvailable) {
        this.loanAvailable = loanAvailable;
    }

    public boolean isNegotiable() {
        return negotiable;
    }

    public void setNegotiable(boolean negotiable) {
        this.negotiable = negotiable;
    }

    public long getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(long activationDate) {
        this.activationDate = activationDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFacingDesc() {
        return facingDesc;
    }

    public void setFacingDesc(String facingDesc) {
        this.facingDesc = facingDesc;
    }

    public String getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuilderName() {
        return builderName;
    }

    public void setBuilderName(String builderName) {
        this.builderName = builderName;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getFurnishingDesc() {
        return furnishingDesc;
    }

    public void setFurnishingDesc(String furnishingDesc) {
        this.furnishingDesc = furnishingDesc;
    }

    public Object getAmenities() {
        return amenities;
    }

    public void setAmenities(Object amenities) {
        this.amenities = amenities;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public String getAccomodationType() {
        return accomodationType;
    }

    public void setAccomodationType(String accomodationType) {
        this.accomodationType = accomodationType;
    }

    public String getTenantTypeDesc() {
        return tenantTypeDesc;
    }

    public void setTenantTypeDesc(String tenantTypeDesc) {
        this.tenantTypeDesc = tenantTypeDesc;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getLeaseType() {
        return leaseType;
    }

    public void setLeaseType(String leaseType) {
        this.leaseType = leaseType;
    }

    public long getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(long lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Photos[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photos[] photos) {
        this.photos = photos;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public String getWaterSupply() {
        return waterSupply;
    }

    public void setWaterSupply(String waterSupply) {
        this.waterSupply = waterSupply;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getInactiveReason() {
        return inactiveReason;
    }

    public void setInactiveReason(String inactiveReason) {
        this.inactiveReason = inactiveReason;
    }

    public String getFacing() {
        return facing;
    }

    public void setFacing(String facing) {
        this.facing = facing;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getNbLocality() {
        return nbLocality;
    }

    public void setNbLocality(String nbLocality) {
        this.nbLocality = nbLocality;
    }

    public boolean isSponsored() {
        return sponsored;
    }

    public void setSponsored(boolean sponsored) {
        this.sponsored = sponsored;
    }

    @Override
    public String toString() {
        return "Data{" +
                "parking='" + parking + '\'' +
                ", secondaryTitle='" + secondaryTitle + '\'' +
                ", dateOnly=" + dateOnly +
                ", buildingName='" + buildingName + '\'' +
                ", deposit=" + deposit +
                ", location='" + location + '\'' +
                ", street='" + street + '\'' +
                ", score=" + score +
                ", parkingDesc='" + parkingDesc + '\'' +
                ", forLease=" + forLease +
                ", type='" + type + '\'' +
                ", bathroom=" + bathroom +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                ", photoAvailable=" + photoAvailable +
                ", totalFloor=" + totalFloor +
                ", description='" + description + '\'' +
                ", propertySize=" + propertySize +
                ", accomodationTypeDesc='" + accomodationTypeDesc + '\'' +
                ", shortUrl='" + shortUrl + '\'' +
                ", longitude=" + longitude +
                ", gym=" + gym +
                ", sharedAccomodation=" + sharedAccomodation +
                ", shortlistedByLoggedInUser=" + shortlistedByLoggedInUser +
                ", propertyTitle='" + propertyTitle + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", furnishing='" + furnishing + '\'' +
                ", balconies=" + balconies +
                ", propertyAge=" + propertyAge +
                ", cupBoard=" + cupBoard +
                ", powerBackup='" + powerBackup + '\'' +
                ", accurateLocation=" + accurateLocation +
                ", adminEvent='" + adminEvent + '\'' +
                ", managed='" + managed + '\'' +
                ", floor=" + floor +
                ", amenitiesMap=" + amenitiesMap +
                ", swimmingPool=" + swimmingPool +
                ", lift=" + lift +
                ", availableFrom=" + availableFrom +
                ", active=" + active +
                ", buildingType='" + buildingType + '\'' +
                ", localityId='" + localityId + '\'' +
                ", latitude=" + latitude +
                ", weight=" + weight +
                ", ownerId='" + ownerId + '\'' +
                ", loanAvailable=" + loanAvailable +
                ", negotiable=" + negotiable +
                ", activationDate=" + activationDate +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", facingDesc='" + facingDesc + '\'' +
                ", propertyCode='" + propertyCode + '\'' +
                ", rent=" + rent +
                ", buildingId='" + buildingId + '\'' +
                ", builderName='" + builderName + '\'' +
                ", detailUrl='" + detailUrl + '\'' +
                ", furnishingDesc='" + furnishingDesc + '\'' +
                ", amenities=" + amenities +
                ", society='" + society + '\'' +
                ", accomodationType='" + accomodationType + '\'' +
                ", tenantTypeDesc='" + tenantTypeDesc + '\'' +
                ", typeDesc='" + typeDesc + '\'' +
                ", leaseType='" + leaseType + '\'' +
                ", lastUpdateDate=" + lastUpdateDate +
                ", photos=" + Arrays.toString(photos) +
                ", creationDate=" + creationDate +
                ", waterSupply='" + waterSupply + '\'' +
                ", propertyType='" + propertyType + '\'' +
                ", inactiveReason='" + inactiveReason + '\'' +
                ", facing='" + facing + '\'' +
                ", locality='" + locality + '\'' +
                ", nbLocality='" + nbLocality + '\'' +
                ", sponsored=" + sponsored +
                '}';
    }
}
