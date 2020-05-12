package com.example.ohcuaca.Retrofit;
import com.example.ohcuaca.Model.WeatherForecastResult;
import com.example.ohcuaca.Model.WeatherResult;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatherByLatLng(@Query("lat") String lat,
                                                 @Query("lon") String lng,
                                                 @Query("appid") String appid,
                                                 @Query("units") String unit);


    @GET("forecast")
    Observable<WeatherForecastResult> getForecastWeatherByLatLng(@Query("lat") String lat,
                                                         @Query("lon") String lng,
                                                         @Query("appid") String appid,
                                                         @Query("units") String unit);
}
