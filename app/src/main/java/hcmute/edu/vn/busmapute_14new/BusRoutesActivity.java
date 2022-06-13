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

        busRouteAdapter = new BusRouteAdapter(mListBusRoute,mListBusStop);
        expandableListView.setAdapter(busRouteAdapter);
    }

    private Map<BusRoute, List<BusStop>> getmListBusStop (){
        Map<BusRoute, List<BusStop>> listMap = new LinkedHashMap<>();

        BusRoute busRoute8 = new BusRoute(8, "Bus Route 8");
        BusRoute busRoute104 = new BusRoute(104, "Bus Route 104");
        BusRoute busRoute56 = new BusRoute(56, "Bus Route 56");
        BusRoute busRoute4 = new BusRoute(4, "Bus Route 4");
        BusRoute busRoute53 = new BusRoute(53, "Bus Route 53");

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
        busStop8.add(new BusStop(31,"Nga Tu Thich Quang Duc"));
        busStop8.add(new BusStop(32,"Dai Hoc Van Hien"));
        busStop8.add(new BusStop(33,"Benh Vien Phuoc An"));
        busStop8.add(new BusStop(34,"Cong An Phong Chay Chua Chay"));
        busStop8.add(new BusStop(35,"Lang Ong Ba Chieu"));
        busStop8.add(new BusStop(37,"Cho Ba Chieu"));
        busStop8.add(new BusStop(36,"Toa An Nhan Dan Quan Binh Thanh"));
        busStop8.add(new BusStop(38,"Chua Bo De"));
        busStop8.add(new BusStop(39,"Nha Tho Hang Xanh"));
        busStop8.add(new BusStop(40,"Cho Hang Xanh"));
        busStop8.add(new BusStop(41,"Nga Ba Hang Xanh"));
        busStop8.add(new BusStop(42,"Dai Liet Si"));
        busStop8.add(new BusStop(43,"Sieu Thi Coop Mart"));
        busStop8.add(new BusStop(44,"Cong Ra - Ben Xe Mien Dong"));
        busStop8.add(new BusStop(45,"Nga Tu Binh Trieu"));
        busStop8.add(new BusStop(46,"Duong So 20"));
        busStop8.add(new BusStop(47,"Chua Uu Dam"));
        busStop8.add(new BusStop(48,"Ca Sau Hoa Ca"));
        busStop8.add(new BusStop(49,"THCS Ngo Chi Quoc"));
        busStop8.add(new BusStop(50,"Chua An Lac"));
        busStop8.add(new BusStop(51,"Cau Go Dua"));
        busStop8.add(new BusStop(52,"Truong Cao Dang Vinatex"));
        busStop8.add(new BusStop(53,"Tram Xang 27-7"));
        busStop8.add(new BusStop(54,"Cong An Phuong Linh Dong"));
        busStop8.add(new BusStop(55,"Tram Cau Ngang"));
        busStop8.add(new BusStop(56,"Cho Thu Duc"));
        busStop8.add(new BusStop(57,"Nga Ba Chuong Duong"));
        busStop8.add(new BusStop(58,"Cao Dang Xay Dung So 2"));
        busStop8.add(new BusStop(59,"Sieu Thi Nguyen Kim"));
        busStop8.add(new BusStop(60,"DH Su Pham Ky Thuat"));
        busStop8.add(new BusStop(61,"Cong An Quan 9"));
        busStop8.add(new BusStop(62,"Cho Chieu"));
        busStop8.add(new BusStop(63,"Khu Cong Nghe Cao Quan 9"));
        busStop8.add(new BusStop(64,"Cau Vuot Tram 2"));
        busStop8.add(new BusStop(65,"Suoi Tien"));
        busStop8.add(new BusStop(66,"Dai Hoc Quoc Gia"));

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
        busStop104.add(new BusStop(15,"Tram Etown"));
        busStop104.add(new BusStop(16,"Nga Ba Binh Gia"));
        busStop104.add(new BusStop(17,"Hoang Hoa Tham"));
        busStop104.add(new BusStop(18,"Pico Plaza"));
        busStop104.add(new BusStop(19,"Tram Ut Tich"));
        busStop104.add(new BusStop(20,"Lang Cha Ca"));
        busStop104.add(new BusStop(21,"Pham Van Hai"));
        busStop104.add(new BusStop(22,"Tram Bao Tang Mien Dong"));
        busStop104.add(new BusStop(23,"Sieu Thi Big C"));
        busStop104.add(new BusStop(24,"Khach San Tan Son Nhat"));
        busStop104.add(new BusStop(25,"Cong An Phu Nhuan"));
        busStop104.add(new BusStop(26,"Nga Tu Phu Nhuan"));
        busStop104.add(new BusStop(27,"Nga Tu Phan Xich Long"));
        busStop104.add(new BusStop(28,"Nga Tu Thich Quang Duc"));
        busStop104.add(new BusStop(29,"Dai Hoc Van Hien"));
        busStop104.add(new BusStop(30,"Benh Vien Phuoc An"));
        busStop104.add(new BusStop(31,"Cong An Phong Chay Chua Chay"));
        busStop104.add(new BusStop(32,"Lang Ong Ba Chieu"));
        busStop104.add(new BusStop(33,"Cho Ba Chieu"));
        busStop104.add(new BusStop(34,"Toa An Nhan Dan Quan Binh Thanh"));
        busStop104.add(new BusStop(35,"Chua Bo De"));
        busStop104.add(new BusStop(36,"Nha Tho Hang Xanh"));
        busStop104.add(new BusStop(37,"Cho Hang Xanh"));
        busStop104.add(new BusStop(38,"Dai Hoc HUTECH"));
        busStop104.add(new BusStop(39,"Khu Du Lich Van Thanh"));
        busStop104.add(new BusStop(40,"Cau Sai Gon"));
        busStop104.add(new BusStop(41,"Cau Den"));
        busStop104.add(new BusStop(42,"Thao Dien"));
        busStop104.add(new BusStop(43,"Metro Quan 2"));
        busStop104.add(new BusStop(44,"Cat Lai"));
        busStop104.add(new BusStop(45,"Xi Mang Ha Tien - Tram Thu Phi"));
        busStop104.add(new BusStop(46,"Nga 4 Tay Hoa (RMK)"));
        busStop104.add(new BusStop(47,"Tram Xay Dung"));
        busStop104.add(new BusStop(48,"Khu QLGTDT So 2"));
        busStop104.add(new BusStop(49,"Nga 4 Binh Thai"));
        busStop104.add(new BusStop(50,"UBND Quan 9"));
        busStop104.add(new BusStop(51,"Be Tong Hai Au"));
        busStop104.add(new BusStop(52,"Nga 4 Thu Duc"));
        busStop104.add(new BusStop(53,"Dai Hoc Su Pham Ky Thuat"));
        busStop104.add(new BusStop(54,"Nha May Nuoc Thu Duc"));
        busStop104.add(new BusStop(55,"Nga Ba Le Van Chi"));
        busStop104.add(new BusStop(56,"To Vinh Dien"));
        busStop104.add(new BusStop(57,"Hoang Dieu 2"));
        busStop104.add(new BusStop(58,"Nga Ba Linh Trung Duong So 6"));
        busStop104.add(new BusStop(59,"Nga Ba Duong 14"));
        busStop104.add(new BusStop(60,"Duong So 14"));
        busStop104.add(new BusStop(61,"DH Kinh Te Luat"));
        busStop104.add(new BusStop(62,"Cong Ty Dien Tu Samsung"));
        busStop104.add(new BusStop(63,"Dai Hoc Nong Lam"));

        // Bus Route 56 (Tuyen xe so 56)
        List<BusStop> busStop56 = new ArrayList<>();
        busStop56.add(new BusStop(1,"Ben xe Cho Lon"));
        busStop56.add(new BusStop(2,"Chu Van An"));
        busStop56.add(new BusStop(3,"Thap Muoi"));
        busStop56.add(new BusStop(4,"Cho Kim Bien"));
        busStop56.add(new BusStop(5,"Buu Dien Quan 5"));
        busStop56.add(new BusStop(6,"Rap Dai Quang"));
        busStop56.add(new BusStop(7,"Benh Vien Cho Ray"));
        busStop56.add(new BusStop(8,"Dai Hoc Y Duoc"));
        busStop56.add(new BusStop(9,"Benh Vien Dai Hoc Y Duoc"));
        busStop56.add(new BusStop(10,"Benh Vien Nguyen Tri Phuong"));
        busStop56.add(new BusStop(11,"Cho An Dong"));
        busStop56.add(new BusStop(12,"Huynh Man Dat"));
        busStop56.add(new BusStop(13,"Cho Bau Sen"));
        busStop56.add(new BusStop(14,"Dai Hoc Sai Gon"));
        busStop56.add(new BusStop(15,"Bo Cong An"));
        busStop56.add(new BusStop(16,"Bao An Ninh The Gioi"));
        busStop56.add(new BusStop(17,"Nha Khach Bo Cong An"));
        busStop56.add(new BusStop(18,"Tran Dinh Xu"));
        busStop56.add(new BusStop(19,"Tran Hung Dao"));
        busStop56.add(new BusStop(20,"Rap Tran Hung Dao"));
        busStop56.add(new BusStop(21,"KTX Tran Hung Dao"));
        busStop56.add(new BusStop(22,"Nguyen Kim"));
        busStop56.add(new BusStop(23,"Ben Thanh F"));
        busStop56.add(new BusStop(24,"Ham Nghi"));
        busStop56.add(new BusStop(25,"Cho Cu"));
        busStop56.add(new BusStop(26,"Ho Tung Mau"));
        busStop56.add(new BusStop(27,"Ben Bach Dang"));
        busStop56.add(new BusStop(28,"Bao Tang Ton Duc Thang"));
        busStop56.add(new BusStop(29,"Ngo Van Nam"));
        busStop56.add(new BusStop(30,"Ba Son"));
        busStop56.add(new BusStop(31,"Nguyen Huu Canh"));
        busStop56.add(new BusStop(32,"Mam Non Hoa Lu"));
        busStop56.add(new BusStop(33,"Ho Boi Hai Quan"));
        busStop56.add(new BusStop(34,"Chung Cu Manor"));
        busStop56.add(new BusStop(35,"Tan Cang"));
        busStop56.add(new BusStop(37,"Cau Den"));
        busStop56.add(new BusStop(36,"Thao Dien"));
        busStop56.add(new BusStop(38,"Metro Quan 2"));
        busStop56.add(new BusStop(39,"Cat Lai"));
        busStop56.add(new BusStop(40,"Xi Mang Ha Tien - Tram Thu Phi"));
        busStop56.add(new BusStop(41,"Nga 4 Tay Hoa (RMK)"));
        busStop56.add(new BusStop(42,"Tram Xay Dung"));
        busStop56.add(new BusStop(43,"Khu QLGTDT So 2"));
        busStop56.add(new BusStop(44,"Cong Ty Sanofi Aventis"));
        busStop56.add(new BusStop(45,"Cong Ty May Sai Gon"));
        busStop56.add(new BusStop(46,"Truong Mam Non Vanh Khuyen"));
        busStop56.add(new BusStop(47,"Lang Tre Em SOS"));
        busStop56.add(new BusStop(48,"Nga Ba Chuong Duong"));
        busStop56.add(new BusStop(49,"Cao Dang Xay Dung 2"));
        busStop56.add(new BusStop(50,"Sieu Thi Nguyen Kim"));
        busStop56.add(new BusStop(51,"Dai Hoc Su Pham Ky Thuat"));
        busStop56.add(new BusStop(52,"Sieu Thi CoopMart"));
        busStop56.add(new BusStop(53,"Benh Vien 7C - Truong Quan Y 2"));
        busStop56.add(new BusStop(54,"Nha Sach Thanh Nghia"));
        busStop56.add(new BusStop(55,"Tram Y Te Phuong Hiep Phu"));
        busStop56.add(new BusStop(56,"Cho Hiep Phu"));
        busStop56.add(new BusStop(57,"Cho Tang Nhon Phu"));
        busStop56.add(new BusStop(58,"Benh Vien Quan 9"));
        busStop56.add(new BusStop(59,"Dai Hoc GTVT"));
        busStop56.add(new BusStop(60,"KTX Dai Hoc Su Pham Ky Thuat"));

        // Bus Route 4 (Tuyen xe so 4)
        List<BusStop> busStop4 = new ArrayList<>();
        busStop4.add(new BusStop(1,"Ben Xe Buyt Sai Gon"));
        busStop4.add(new BusStop(2,"Ton That Tung"));
        busStop4.add(new BusStop(3,"Nguyen Thi Nghia"));
        busStop4.add(new BusStop(4,"Truong Ernst Thalmann"));
        busStop4.add(new BusStop(5,"Ham Nghi"));
        busStop4.add(new BusStop(6,"Nam Ky Khoi Nghia"));
        busStop4.add(new BusStop(7,"Cho Cu"));
        busStop4.add(new BusStop(8,"Den Tho An Giao, Pasteur"));
        busStop4.add(new BusStop(9,"Le Thanh Ton"));
        busStop4.add(new BusStop(10,"Ly Tu Trong"));
        busStop4.add(new BusStop(11,"Le Duan"));
        busStop4.add(new BusStop(12,"Nguyen Thi Minh Khai"));
        busStop4.add(new BusStop(13,"Dai Hoc Kien Truc"));
        busStop4.add(new BusStop(14,"Dien Bien Phu"));
        busStop4.add(new BusStop(15,"Vo Thi Sau"));
        busStop4.add(new BusStop(16,"Nha Thieu Nhi Thanh Pho"));
        busStop4.add(new BusStop(17,"Vien Pasteur"));
        busStop4.add(new BusStop(18,"Tran Quoc Toan"));
        busStop4.add(new BusStop(19,"Ly Chinh Thang"));
        busStop4.add(new BusStop(20,"Chua Vinh Nghiem"));
        busStop4.add(new BusStop(21,"Nga Tu Tran Huy Lieu"));
        busStop4.add(new BusStop(22,"Trung Tam Van Hoa Quan Phu Nhuan"));
        busStop4.add(new BusStop(23,"Cong Xe Lua"));
        busStop4.add(new BusStop(24,"Benh Vien Quan Phu Nhuan"));
        busStop4.add(new BusStop(25,"Cay Xang Quan Khu 7"));
        busStop4.add(new BusStop(26,"Cong Truoc SVD Quan Khu 7"));
        busStop4.add(new BusStop(27,"Cong Vien Hoang Van Thu"));
        busStop4.add(new BusStop(28,"Lang Cha Ca"));
        busStop4.add(new BusStop(29,"Sieu Thi Maximark Cong Hoa"));
        busStop4.add(new BusStop(30,"Nha Hat Quan Doi"));
        busStop4.add(new BusStop(31,"Ngan Hang Quan Doi"));
        busStop4.add(new BusStop(32,"Cong Ty Lo Hoi"));
        busStop4.add(new BusStop(33,"Nga Tu Hoang Hoa Tham"));
        busStop4.add(new BusStop(34,"Nga Ba Binh Gia"));
        busStop4.add(new BusStop(35,"E-Town"));
        busStop4.add(new BusStop(37,"Thuong Uyen"));
        busStop4.add(new BusStop(36,"Mui Tau Cong Hoa"));
        busStop4.add(new BusStop(38,"Nga Ba Che Lan Vien"));
        busStop4.add(new BusStop(39,"UBND Phuong 15"));
        busStop4.add(new BusStop(40,"Khu Cong Nghiep Tan Binh"));
        busStop4.add(new BusStop(41,"Cau Tham Luong - Sieu Thi Thien Hoa"));
        busStop4.add(new BusStop(42,"Chua Vinh Phuoc"));
        busStop4.add(new BusStop(43,"Chua Lac Quang"));
        busStop4.add(new BusStop(44,"Bitis"));
        busStop4.add(new BusStop(45,"Ben Xe An Suong"));

        // Bus Route 53 (Tuyen xe so 53)
        List<BusStop> busStop53 = new ArrayList<>();
        busStop53.add(new BusStop(1,"Le Hong Phong"));
        busStop53.add(new BusStop(2,"Nha Sach Minh Khai"));
        busStop53.add(new BusStop(3,"Tran Hung Dao"));
        busStop53.add(new BusStop(4,"Rap Tran Hung Dao"));
        busStop53.add(new BusStop(5,"KTX Tran Hung Dao"));
        busStop53.add(new BusStop(6,"Nguyen Kim"));
        busStop53.add(new BusStop(7,"Tram Trung Chuyen Tren Duong Ham Nghi"));
        busStop53.add(new BusStop(8,"Ben Bach Dang"));
        busStop53.add(new BusStop(9,"Nguyen Huu Canh"));
        busStop53.add(new BusStop(10,"Cau Den"));
        busStop53.add(new BusStop(11,"Khu QLGTDT So 2"));
        busStop53.add(new BusStop(12,"Dau Duong Le Van Chi"));
        busStop53.add(new BusStop(13,"Dai Hoc Ngan Hang"));
        busStop53.add(new BusStop(14,"Vietcombank"));
        busStop53.add(new BusStop(15,"Cau Vuot Tram 2"));
        busStop53.add(new BusStop(16,"Suoi Tien"));
        busStop53.add(new BusStop(17,"Vanh Dai DHQG TPHCM"));
        busStop53.add(new BusStop(18,"Ben Xe Buyt Khu A DHQG"));
        busStop53.add(new BusStop(19,"Nha Van Hoa Sinh Vien"));
        busStop53.add(new BusStop(20,"Dai Hoc Quoc Te"));
        busStop53.add(new BusStop(21,"Ho Da"));
        busStop53.add(new BusStop(22,"Nha Khach DHQG"));
        busStop53.add(new BusStop(23,"Vien Tai Nguyen Moi Truong"));
        busStop53.add(new BusStop(24,"KTX Khu B DHQG"));
        busStop53.add(new BusStop(25,"Ben Xe Buyt DH Quoc Gia"));

        listMap.put(busRoute8, busStop8);
        listMap.put(busRoute104, busStop104);
        listMap.put(busRoute56, busStop56);
        listMap.put(busRoute4, busStop4);
        listMap.put(busRoute53, busStop53);

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