package acheiaqui.com.acheiaqui;

public class LocationData
{
    double latitude;
    double longitude;

    public LocationData(double latitude, double longitude)
    {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LocationData(){

    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
