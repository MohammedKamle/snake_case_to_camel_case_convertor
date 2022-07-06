# snake_case_to_camel_case_convertor
## Introduction
This tool will help you to convert the instance variable you get from jsonToJava convertor as shown below
```
    public String title;
    public ArrayList<String> client_list;
    public Timeline timeline;
    public int global_repeat_count;
    public int daily_repeat_count;
    public int repeat_count;
    public String text;
    public ArrayList<StoreList> store_list;
    public Shares shares;
    public String city_id;
    public int mdv;
    public int mov;
    public String offer_type;
    public String sampling_type;
    public ArrayList<Object> area_ids;
    public String status;
    public ArrayList<String> users_segments;
    public ArrayList<String> areaIds;
    public ArrayList<Object> geoGroups;
    public ArrayList<Object> excludedAreaIds;
    public Coupon coupon;
```
to something like this :
```
public String title;
@SerializedName("client_list")
public ArrayList<String> clientList;
public Timeline timeline;
@SerializedName("global_repeat_count")
public int globalRepeatCount;
@SerializedName("daily_repeat_count")
public int dailyRepeatCount;
@SerializedName("repeat_count")
public int repeatCount;
public String text;
@SerializedName("store_list")
public ArrayList<StoreList> storeList;
public Shares shares;
@SerializedName("city_id")
public String cityId;
public int mdv;
public int mov;
@SerializedName("offer_type")
public String offerType;
@SerializedName("sampling_type")
public String samplingType;
@SerializedName("area_ids")
public ArrayList<Object> areaIds;
public String status;
@SerializedName("users_segments")
public ArrayList<String> usersSegments;
public ArrayList<String> areaIds;
public ArrayList<Object> geoGroups;
public ArrayList<Object> excludedAreaIds;
public Coupon coupon;
```
## Setup

- Clone the repository
- install dependency with
   ```
    mvn install
    ```
- Add your input in [input.txt](input.txt), a sample input is already present
- Run the following :
  ```
  mvn compile exec:java -Dexec.mainClass="Main"
  ```
