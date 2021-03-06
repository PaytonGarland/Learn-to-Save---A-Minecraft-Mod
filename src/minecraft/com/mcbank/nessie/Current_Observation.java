package com.mcbank.nessie;

public class Current_Observation
{
    private transient Object image;
    private transient Object display_location;
    private transient Object observation_location;
    private transient Object estimated;
    private String station_id;
    private String observation_time;
    private String observation_time_rfc822;
    private String observation_epoch;
    private String local_time_rfc822;
    private String local_epoch;
    private String local_tz_short;
    private String local_tz_long;
    private String local_tz_offset;
    private String weather;
    private String temperature_string;
    private String temp_f;
    private String temp_c;
    private String relative_humidity;
    private String wind_string;
    private String wind_dir;
    private String wind_degrees;
    private String wind_mpg;
    private String wind_gust_mpg;
    private String wind_kph;
    private String wind_gust_kph;
    private String pressure_mb;
    private String pressure_in;
    private String pressure_trend;
    private String dewpoint_string;
    private String dewpoint_f;
    private String dewpoint_c;
    private String heat_index_string;
    private String heat_index_f;
    private String head_index_c;
    private String windchill_string;
    private String windchill_f;
    private String windchill_c;
    private String feelslike_string;
    private String feelslike_f;
    private String feelslike_c;
    private String visibility_mi;
    private String visibility_km;
    private String solarradiation;
    private String UV;
    private String precip_1hr_string;
    private String precip_1hr_in;
    private String precip_1hr_metric;
    private String precip_today_string;
    private String precip_today_in;
    private String precip_today_metric;
    private String icon;
    private String icon_url;
    private String forecast_url;
    private String history_url;
    private String ob_url;
    private String nowcast;

    public Current_Observation()
    {
    }

    public String getLocal_time_rfc822()
    {
        return local_time_rfc822;
    }

    public void setLocal_time_rfc822(String local_time_rfc822)
    {
        this.local_time_rfc822 = local_time_rfc822;
    }

    public String getPrecip_1hr_in()
    {
        return precip_1hr_in;
    }

    public void setPrecip_1hr_in(String precip_1hr_in)
    {
        this.precip_1hr_in = precip_1hr_in;
    }
}
