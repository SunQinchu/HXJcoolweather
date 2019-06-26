package cn.edu.bnuz.hxjcoolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public String cityName;//让json字段和java字段之间建立映射关系
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
