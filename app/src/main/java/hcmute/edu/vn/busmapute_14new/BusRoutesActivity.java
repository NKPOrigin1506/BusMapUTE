package hcmute.edu.vn.busmapute_14new;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BusRoutesActivity extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private List<BusRoute> mListBusRoute;
    private Map<BusRoute, List<BusStop>> mListBusStop;
    private BusRouteAdapter busRouteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_routes);

        getSupportActionBar().setTitle("Bus Routes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        expandableListView = (ExpandableListView) findViewById(R.id.listViewBusRoutes);

        mListBusStop = getmListBusStop();
        mListBusRoute = new ArrayList<>(mListBusStop.keySet());

        BusRouteAdapter busRouteAdapter = new BusRouteAdapter(mListBusRoute,mListBusStop);
        expandableListView.setAdapter(busRouteAdapter);
    }

    private Map<BusRoute, List<BusStop>> getmListBusStop (){
        Map<BusRoute, List<BusStop>> listMap = new LinkedHashMap<>();

        BusRoute busRoute8 = new BusRoute(8, "Tuyen so 8");
        BusRoute busRoute104 = new BusRoute(104, "Tuyen so 104");
        BusRoute busRoute56 = new BusRoute(56, "Tuyen so 56");
        BusRoute busRoute4 = new BusRoute(4, "Tuyen so 4");
        BusRoute busRoute53 = new BusRoute(53, "Tuyen so 53");

        // Bus Route 8 (Tuyen xe so 8)
        List<BusStop> busStop8 = new ArrayList<>();
        busStop8.add(new BusStop(1,"Ben xe Quan 8"));
        busStop8.add(new BusStop(2,"Bui Minh Truc"));
        busStop8.add(new BusStop(3,"Cau Nhi Thien Duong"));
        busStop8.add(new BusStop(4,"Tung Thien Vuong"));
        busStop8.add(new BusStop(5,"Cho Xom Cui"));
        busStop8.add(new BusStop(6,"Buu Dien Quan 5"));
        busStop8.add(new BusStop(7,"Rap Dai Quang"));
        busStop8.add(new BusStop(8,"Benh Vien Cho Ray"));
        busStop8.add(new BusStop(9,"Hung Vuong Plaza"));
        busStop8.add(new BusStop(10,"Coop Mart Ly Thuong Kiet"));
        busStop8.add(new BusStop(11,"Dien Luc Phu Tho"));
        busStop8.add(new BusStop(12,"Nha Thi Dau Phu Tho"));
        busStop8.add(new BusStop(13,"Benh Vien Trung Vuong"));
        busStop8.add(new BusStop(14,"Dai Hoc Bach Khoa"));
        busStop8.add(new BusStop(15,"Buu Dien Phu Tho"));
        busStop8.add(new BusStop(16,"Nga Ba Thanh Thai"));
        busStop8.add(new BusStop(17,"Sieu Thi Nguyen Kim - CMC Tan Binh"));
        busStop8.add(new BusStop(18,"Tram Cay Xang So 9"));
        busStop8.add(new BusStop(19,"Cho Tan Binh"));
        busStop8.add(new BusStop(20,"Benh Vien Chinh Hinh va Phuc Hoi Chuc Nang"));
        busStop8.add(new BusStop(21,"Benh Vien Thong Nhat"));
        busStop8.add(new BusStop(22,"Hoi Cho Trien Lam Tan Binh"));
        busStop8.add(new BusStop(23,"Nha Hang Dong Phuong"));
        busStop8.add(new BusStop(24,"Pham Van Hai"));
        busStop8.add(new BusStop(25,"Tram Bao Tang Mien Dong"));
        busStop8.add(new BusStop(26,"Sieu Thi Big C"));
        busStop8.add(new BusStop(27,"Khach San Tan Son Nhat"));
        busStop8.add(new BusStop(28,"Cong An Phu Nhuan"));
        busStop8.add(new BusStop(29,"Nga Tu Phu Nhuan"));
        busStop8.add(new BusStop(30,"Nga Tu Phan Xich Long"));

        // Bus Route 104 (Tuyen xe so 104)
        List<BusStop> busStop104 = new ArrayList<>();
        busStop104.add(new BusStop(1,"Ben xe An Suong"));
        busStop104.add(new BusStop(2,"Cho Chieu"));
        busStop104.add(new BusStop(3,"Bitis"));
        busStop104.add(new BusStop(4,"Chua Lac Quang"));
        busStop104.add(new BusStop(5,"Chua Vinh Phuoc"));
        busStop104.add(new BusStop(6,"Sieu Thi Cho Lon"));
        busStop104.add(new BusStop(7,"Thien Hoa"));
        busStop104.add(new BusStop(8,"Tram Det Thanh Cong"));
        busStop104.add(new BusStop(9,"KCN Tan Binh"));
        busStop104.add(new BusStop(10,"Coop Mart Thang Loi"));
        busStop104.add(new BusStop(11,"Che Lan Vien"));
        busStop104.add(new BusStop(12,"Dai Liet Sy"));
        busStop104.add(new BusStop(13,"Thuong Uyen"));
        busStop104.add(new BusStop(14,"Tan Ky Tan Quy"));

        listMap.put(busRoute8, busStop8);
        listMap.put(busRoute104, busStop104);

        return listMap;
    }

    // this event will enable the back function to the button on press
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}