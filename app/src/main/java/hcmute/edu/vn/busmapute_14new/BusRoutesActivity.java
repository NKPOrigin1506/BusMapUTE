package hcmute.edu.vn.busmapute_14new;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BusRoutesActivity extends AppCompatActivity {

    SearchView searchRoute;
    ExpandableListView expandableListView;
    List<BusRoute> mListBusRoute;
    Map<BusRoute, List<BusStop>> mListBusStop;
    BusRouteAdapter busRouteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_routes);

        getSupportActionBar().setTitle("Bus Routes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        expandableListView = findViewById(R.id.listViewBusRoutes);

        mListBusStop = getmListBusStop();
        mListBusRoute = new ArrayList<>(mListBusStop.keySet());

        busRouteAdapter = new BusRouteAdapter(mListBusRoute, mListBusStop);
        expandableListView.setAdapter(busRouteAdapter);
    }

    private Map<BusRoute, List<BusStop>> getmListBusStop() {
        Map<BusRoute, List<BusStop>> listMap = new LinkedHashMap<>();

        BusRoute busRoute8 = new BusRoute(8, "Bus Route 8");
        BusRoute busRoute104 = new BusRoute(104, "Bus Route 104");
        BusRoute busRoute56 = new BusRoute(56, "Bus Route 56");
        BusRoute busRoute4 = new BusRoute(4, "Bus Route 4");
        BusRoute busRoute53 = new BusRoute(53, "Bus Route 53");
        BusRoute busRoute41 = new BusRoute(41, "Bus Route 41");
        BusRoute busRoute32 = new BusRoute(32, "Bus Route 32");
        BusRoute busRoute16 = new BusRoute(16, "Bus Route 16");

        // Bus Route 8 (Tuyen xe so 8)
        List<BusStop> busStop8 = new ArrayList<>();
        busStop8.add(new BusStop(1, "Ben xe Quan 8"));
        busStop8.add(new BusStop(2, "Bui Minh Truc"));
        busStop8.add(new BusStop(3, "Cau Nhi Thien Duong"));
        busStop8.add(new BusStop(4, "Tung Thien Vuong"));
        busStop8.add(new BusStop(5, "Cho Xom Cui"));
        busStop8.add(new BusStop(6, "Buu Dien Quan 5"));
        busStop8.add(new BusStop(7, "Rap Dai Quang"));
        busStop8.add(new BusStop(8, "Benh Vien Cho Ray"));
        busStop8.add(new BusStop(9, "Hung Vuong Plaza"));
        busStop8.add(new BusStop(10, "Coop Mart Ly Thuong Kiet"));
        busStop8.add(new BusStop(11, "Dien Luc Phu Tho"));
        busStop8.add(new BusStop(12, "Nha Thi Dau Phu Tho"));
        busStop8.add(new BusStop(13, "Benh Vien Trung Vuong"));
        busStop8.add(new BusStop(14, "Dai Hoc Bach Khoa"));
        busStop8.add(new BusStop(15, "Buu Dien Phu Tho"));
        busStop8.add(new BusStop(16, "Nga Ba Thanh Thai"));
        busStop8.add(new BusStop(17, "Sieu Thi Nguyen Kim - CMC Tan Binh"));
        busStop8.add(new BusStop(18, "Tram Cay Xang So 9"));
        busStop8.add(new BusStop(19, "Cho Tan Binh"));
        busStop8.add(new BusStop(20, "Benh Vien Chinh Hinh va Phuc Hoi Chuc Nang"));
        busStop8.add(new BusStop(21, "Benh Vien Thong Nhat"));
        busStop8.add(new BusStop(22, "Hoi Cho Trien Lam Tan Binh"));
        busStop8.add(new BusStop(23, "Nha Hang Dong Phuong"));
        busStop8.add(new BusStop(24, "Pham Van Hai"));
        busStop8.add(new BusStop(25, "Tram Bao Tang Mien Dong"));
        busStop8.add(new BusStop(26, "Sieu Thi Big C"));
        busStop8.add(new BusStop(27, "Khach San Tan Son Nhat"));
        busStop8.add(new BusStop(28, "Cong An Phu Nhuan"));
        busStop8.add(new BusStop(29, "Nga Tu Phu Nhuan"));
        busStop8.add(new BusStop(30, "Nga Tu Phan Xich Long"));
        busStop8.add(new BusStop(31, "Nga Tu Thich Quang Duc"));
        busStop8.add(new BusStop(32, "Dai Hoc Van Hien"));
        busStop8.add(new BusStop(33, "Benh Vien Phuoc An"));
        busStop8.add(new BusStop(34, "Cong An Phong Chay Chua Chay"));
        busStop8.add(new BusStop(35, "Lang Ong Ba Chieu"));
        busStop8.add(new BusStop(37, "Cho Ba Chieu"));
        busStop8.add(new BusStop(36, "Toa An Nhan Dan Quan Binh Thanh"));
        busStop8.add(new BusStop(38, "Chua Bo De"));
        busStop8.add(new BusStop(39, "Nha Tho Hang Xanh"));
        busStop8.add(new BusStop(40, "Cho Hang Xanh"));
        busStop8.add(new BusStop(41, "Nga Ba Hang Xanh"));
        busStop8.add(new BusStop(42, "Dai Liet Si"));
        busStop8.add(new BusStop(43, "Sieu Thi Coop Mart"));
        busStop8.add(new BusStop(44, "Cong Ra - Ben Xe Mien Dong"));
        busStop8.add(new BusStop(45, "Nga Tu Binh Trieu"));
        busStop8.add(new BusStop(46, "Duong So 20"));
        busStop8.add(new BusStop(47, "Chua Uu Dam"));
        busStop8.add(new BusStop(48, "Ca Sau Hoa Ca"));
        busStop8.add(new BusStop(49, "THCS Ngo Chi Quoc"));
        busStop8.add(new BusStop(50, "Chua An Lac"));
        busStop8.add(new BusStop(51, "Cau Go Dua"));
        busStop8.add(new BusStop(52, "Truong Cao Dang Vinatex"));
        busStop8.add(new BusStop(53, "Tram Xang 27-7"));
        busStop8.add(new BusStop(54, "Cong An Phuong Linh Dong"));
        busStop8.add(new BusStop(55, "Tram Cau Ngang"));
        busStop8.add(new BusStop(56, "Cho Thu Duc"));
        busStop8.add(new BusStop(57, "Nga Ba Chuong Duong"));
        busStop8.add(new BusStop(58, "Cao Dang Xay Dung So 2"));
        busStop8.add(new BusStop(59, "Sieu Thi Nguyen Kim"));
        busStop8.add(new BusStop(60, "DH Su Pham Ky Thuat"));
        busStop8.add(new BusStop(61, "Cong An Quan 9"));
        busStop8.add(new BusStop(62, "Cho Chieu"));
        busStop8.add(new BusStop(63, "Khu Cong Nghe Cao Quan 9"));
        busStop8.add(new BusStop(64, "Cau Vuot Tram 2"));
        busStop8.add(new BusStop(65, "Suoi Tien"));
        busStop8.add(new BusStop(66, "Dai Hoc Quoc Gia"));

        // Bus Route 104 (Tuyen xe so 104)
        List<BusStop> busStop104 = new ArrayList<>();
        busStop104.add(new BusStop(1, "Ben xe An Suong"));
        busStop104.add(new BusStop(2, "Cho Chieu"));
        busStop104.add(new BusStop(3, "Bitis"));
        busStop104.add(new BusStop(4, "Chua Lac Quang"));
        busStop104.add(new BusStop(5, "Chua Vinh Phuoc"));
        busStop104.add(new BusStop(6, "Sieu Thi Cho Lon"));
        busStop104.add(new BusStop(7, "Thien Hoa"));
        busStop104.add(new BusStop(8, "Tram Det Thanh Cong"));
        busStop104.add(new BusStop(9, "KCN Tan Binh"));
        busStop104.add(new BusStop(10, "Coop Mart Thang Loi"));
        busStop104.add(new BusStop(11, "Che Lan Vien"));
        busStop104.add(new BusStop(12, "Dai Liet Sy"));
        busStop104.add(new BusStop(13, "Thuong Uyen"));
        busStop104.add(new BusStop(14, "Tan Ky Tan Quy"));
        busStop104.add(new BusStop(15, "Tram Etown"));
        busStop104.add(new BusStop(16, "Nga Ba Binh Gia"));
        busStop104.add(new BusStop(17, "Hoang Hoa Tham"));
        busStop104.add(new BusStop(18, "Pico Plaza"));
        busStop104.add(new BusStop(19, "Tram Ut Tich"));
        busStop104.add(new BusStop(20, "Lang Cha Ca"));
        busStop104.add(new BusStop(21, "Pham Van Hai"));
        busStop104.add(new BusStop(22, "Tram Bao Tang Mien Dong"));
        busStop104.add(new BusStop(23, "Sieu Thi Big C"));
        busStop104.add(new BusStop(24, "Khach San Tan Son Nhat"));
        busStop104.add(new BusStop(25, "Cong An Phu Nhuan"));
        busStop104.add(new BusStop(26, "Nga Tu Phu Nhuan"));
        busStop104.add(new BusStop(27, "Nga Tu Phan Xich Long"));
        busStop104.add(new BusStop(28, "Nga Tu Thich Quang Duc"));
        busStop104.add(new BusStop(29, "Dai Hoc Van Hien"));
        busStop104.add(new BusStop(30, "Benh Vien Phuoc An"));
        busStop104.add(new BusStop(31, "Cong An Phong Chay Chua Chay"));
        busStop104.add(new BusStop(32, "Lang Ong Ba Chieu"));
        busStop104.add(new BusStop(33, "Cho Ba Chieu"));
        busStop104.add(new BusStop(34, "Toa An Nhan Dan Quan Binh Thanh"));
        busStop104.add(new BusStop(35, "Chua Bo De"));
        busStop104.add(new BusStop(36, "Nha Tho Hang Xanh"));
        busStop104.add(new BusStop(37, "Cho Hang Xanh"));
        busStop104.add(new BusStop(38, "Dai Hoc HUTECH"));
        busStop104.add(new BusStop(39, "Khu Du Lich Van Thanh"));
        busStop104.add(new BusStop(40, "Cau Sai Gon"));
        busStop104.add(new BusStop(41, "Cau Den"));
        busStop104.add(new BusStop(42, "Thao Dien"));
        busStop104.add(new BusStop(43, "Metro Quan 2"));
        busStop104.add(new BusStop(44, "Cat Lai"));
        busStop104.add(new BusStop(45, "Xi Mang Ha Tien - Tram Thu Phi"));
        busStop104.add(new BusStop(46, "Nga 4 Tay Hoa (RMK)"));
        busStop104.add(new BusStop(47, "Tram Xay Dung"));
        busStop104.add(new BusStop(48, "Khu QLGTDT So 2"));
        busStop104.add(new BusStop(49, "Nga 4 Binh Thai"));
        busStop104.add(new BusStop(50, "UBND Quan 9"));
        busStop104.add(new BusStop(51, "Be Tong Hai Au"));
        busStop104.add(new BusStop(52, "Nga 4 Thu Duc"));
        busStop104.add(new BusStop(53, "Dai Hoc Su Pham Ky Thuat"));
        busStop104.add(new BusStop(54, "Nha May Nuoc Thu Duc"));
        busStop104.add(new BusStop(55, "Nga Ba Le Van Chi"));
        busStop104.add(new BusStop(56, "To Vinh Dien"));
        busStop104.add(new BusStop(57, "Hoang Dieu 2"));
        busStop104.add(new BusStop(58, "Nga Ba Linh Trung Duong So 6"));
        busStop104.add(new BusStop(59, "Nga Ba Duong 14"));
        busStop104.add(new BusStop(60, "Duong So 14"));
        busStop104.add(new BusStop(61, "DH Kinh Te Luat"));
        busStop104.add(new BusStop(62, "Cong Ty Dien Tu Samsung"));
        busStop104.add(new BusStop(63, "Dai Hoc Nong Lam"));

        // Bus Route 56 (Tuyen xe so 56)
        List<BusStop> busStop56 = new ArrayList<>();
        busStop56.add(new BusStop(1, "Ben xe Cho Lon"));
        busStop56.add(new BusStop(2, "Chu Van An"));
        busStop56.add(new BusStop(3, "Thap Muoi"));
        busStop56.add(new BusStop(4, "Cho Kim Bien"));
        busStop56.add(new BusStop(5, "Buu Dien Quan 5"));
        busStop56.add(new BusStop(6, "Rap Dai Quang"));
        busStop56.add(new BusStop(7, "Benh Vien Cho Ray"));
        busStop56.add(new BusStop(8, "Dai Hoc Y Duoc"));
        busStop56.add(new BusStop(9, "Benh Vien Dai Hoc Y Duoc"));
        busStop56.add(new BusStop(10, "Benh Vien Nguyen Tri Phuong"));
        busStop56.add(new BusStop(11, "Cho An Dong"));
        busStop56.add(new BusStop(12, "Huynh Man Dat"));
        busStop56.add(new BusStop(13, "Cho Bau Sen"));
        busStop56.add(new BusStop(14, "Dai Hoc Sai Gon"));
        busStop56.add(new BusStop(15, "Bo Cong An"));
        busStop56.add(new BusStop(16, "Bao An Ninh The Gioi"));
        busStop56.add(new BusStop(17, "Nha Khach Bo Cong An"));
        busStop56.add(new BusStop(18, "Tran Dinh Xu"));
        busStop56.add(new BusStop(19, "Tran Hung Dao"));
        busStop56.add(new BusStop(20, "Rap Tran Hung Dao"));
        busStop56.add(new BusStop(21, "KTX Tran Hung Dao"));
        busStop56.add(new BusStop(22, "Nguyen Kim"));
        busStop56.add(new BusStop(23, "Ben Thanh F"));
        busStop56.add(new BusStop(24, "Ham Nghi"));
        busStop56.add(new BusStop(25, "Cho Cu"));
        busStop56.add(new BusStop(26, "Ho Tung Mau"));
        busStop56.add(new BusStop(27, "Ben Bach Dang"));
        busStop56.add(new BusStop(28, "Bao Tang Ton Duc Thang"));
        busStop56.add(new BusStop(29, "Ngo Van Nam"));
        busStop56.add(new BusStop(30, "Ba Son"));
        busStop56.add(new BusStop(31, "Nguyen Huu Canh"));
        busStop56.add(new BusStop(32, "Mam Non Hoa Lu"));
        busStop56.add(new BusStop(33, "Ho Boi Hai Quan"));
        busStop56.add(new BusStop(34, "Chung Cu Manor"));
        busStop56.add(new BusStop(35, "Tan Cang"));
        busStop56.add(new BusStop(37, "Cau Den"));
        busStop56.add(new BusStop(36, "Thao Dien"));
        busStop56.add(new BusStop(38, "Metro Quan 2"));
        busStop56.add(new BusStop(39, "Cat Lai"));
        busStop56.add(new BusStop(40, "Xi Mang Ha Tien - Tram Thu Phi"));
        busStop56.add(new BusStop(41, "Nga 4 Tay Hoa (RMK)"));
        busStop56.add(new BusStop(42, "Tram Xay Dung"));
        busStop56.add(new BusStop(43, "Khu QLGTDT So 2"));
        busStop56.add(new BusStop(44, "Cong Ty Sanofi Aventis"));
        busStop56.add(new BusStop(45, "Cong Ty May Sai Gon"));
        busStop56.add(new BusStop(46, "Truong Mam Non Vanh Khuyen"));
        busStop56.add(new BusStop(47, "Lang Tre Em SOS"));
        busStop56.add(new BusStop(48, "Nga Ba Chuong Duong"));
        busStop56.add(new BusStop(49, "Cao Dang Xay Dung 2"));
        busStop56.add(new BusStop(50, "Sieu Thi Nguyen Kim"));
        busStop56.add(new BusStop(51, "Dai Hoc Su Pham Ky Thuat"));
        busStop56.add(new BusStop(52, "Sieu Thi CoopMart"));
        busStop56.add(new BusStop(53, "Benh Vien 7C - Truong Quan Y 2"));
        busStop56.add(new BusStop(54, "Nha Sach Thanh Nghia"));
        busStop56.add(new BusStop(55, "Tram Y Te Phuong Hiep Phu"));
        busStop56.add(new BusStop(56, "Cho Hiep Phu"));
        busStop56.add(new BusStop(57, "Cho Tang Nhon Phu"));
        busStop56.add(new BusStop(58, "Benh Vien Quan 9"));
        busStop56.add(new BusStop(59, "Dai Hoc GTVT"));
        busStop56.add(new BusStop(60, "KTX Dai Hoc Su Pham Ky Thuat"));

        // Bus Route 4 (Tuyen xe so 4)
        List<BusStop> busStop4 = new ArrayList<>();
        busStop4.add(new BusStop(1, "Ben Xe Buyt Sai Gon"));
        busStop4.add(new BusStop(2, "Ton That Tung"));
        busStop4.add(new BusStop(3, "Nguyen Thi Nghia"));
        busStop4.add(new BusStop(4, "Truong Ernst Thalmann"));
        busStop4.add(new BusStop(5, "Ham Nghi"));
        busStop4.add(new BusStop(6, "Nam Ky Khoi Nghia"));
        busStop4.add(new BusStop(7, "Cho Cu"));
        busStop4.add(new BusStop(8, "Den Tho An Giao, Pasteur"));
        busStop4.add(new BusStop(9, "Le Thanh Ton"));
        busStop4.add(new BusStop(10, "Ly Tu Trong"));
        busStop4.add(new BusStop(11, "Le Duan"));
        busStop4.add(new BusStop(12, "Nguyen Thi Minh Khai"));
        busStop4.add(new BusStop(13, "Dai Hoc Kien Truc"));
        busStop4.add(new BusStop(14, "Dien Bien Phu"));
        busStop4.add(new BusStop(15, "Vo Thi Sau"));
        busStop4.add(new BusStop(16, "Nha Thieu Nhi Thanh Pho"));
        busStop4.add(new BusStop(17, "Vien Pasteur"));
        busStop4.add(new BusStop(18, "Tran Quoc Toan"));
        busStop4.add(new BusStop(19, "Ly Chinh Thang"));
        busStop4.add(new BusStop(20, "Chua Vinh Nghiem"));
        busStop4.add(new BusStop(21, "Nga Tu Tran Huy Lieu"));
        busStop4.add(new BusStop(22, "Trung Tam Van Hoa Quan Phu Nhuan"));
        busStop4.add(new BusStop(23, "Cong Xe Lua"));
        busStop4.add(new BusStop(24, "Benh Vien Quan Phu Nhuan"));
        busStop4.add(new BusStop(25, "Cay Xang Quan Khu 7"));
        busStop4.add(new BusStop(26, "Cong Truoc SVD Quan Khu 7"));
        busStop4.add(new BusStop(27, "Cong Vien Hoang Van Thu"));
        busStop4.add(new BusStop(28, "Lang Cha Ca"));
        busStop4.add(new BusStop(29, "Sieu Thi Maximark Cong Hoa"));
        busStop4.add(new BusStop(30, "Nha Hat Quan Doi"));
        busStop4.add(new BusStop(31, "Ngan Hang Quan Doi"));
        busStop4.add(new BusStop(32, "Cong Ty Lo Hoi"));
        busStop4.add(new BusStop(33, "Nga Tu Hoang Hoa Tham"));
        busStop4.add(new BusStop(34, "Nga Ba Binh Gia"));
        busStop4.add(new BusStop(35, "E-Town"));
        busStop4.add(new BusStop(37, "Thuong Uyen"));
        busStop4.add(new BusStop(36, "Mui Tau Cong Hoa"));
        busStop4.add(new BusStop(38, "Nga Ba Che Lan Vien"));
        busStop4.add(new BusStop(39, "UBND Phuong 15"));
        busStop4.add(new BusStop(40, "Khu Cong Nghiep Tan Binh"));
        busStop4.add(new BusStop(41, "Cau Tham Luong - Sieu Thi Thien Hoa"));
        busStop4.add(new BusStop(42, "Chua Vinh Phuoc"));
        busStop4.add(new BusStop(43, "Chua Lac Quang"));
        busStop4.add(new BusStop(44, "Bitis"));
        busStop4.add(new BusStop(45, "Ben Xe An Suong"));

        // Bus Route 53 (Tuyen xe so 53)
        List<BusStop> busStop53 = new ArrayList<>();
        busStop53.add(new BusStop(1, "Le Hong Phong"));
        busStop53.add(new BusStop(2, "Nha Sach Minh Khai"));
        busStop53.add(new BusStop(3, "Tran Hung Dao"));
        busStop53.add(new BusStop(4, "Rap Tran Hung Dao"));
        busStop53.add(new BusStop(5, "KTX Tran Hung Dao"));
        busStop53.add(new BusStop(6, "Nguyen Kim"));
        busStop53.add(new BusStop(7, "Tram Trung Chuyen Tren Duong Ham Nghi"));
        busStop53.add(new BusStop(8, "Ben Bach Dang"));
        busStop53.add(new BusStop(9, "Nguyen Huu Canh"));
        busStop53.add(new BusStop(10, "Cau Den"));
        busStop53.add(new BusStop(11, "Khu QLGTDT So 2"));
        busStop53.add(new BusStop(12, "Dau Duong Le Van Chi"));
        busStop53.add(new BusStop(13, "Dai Hoc Ngan Hang"));
        busStop53.add(new BusStop(14, "Vietcombank"));
        busStop53.add(new BusStop(15, "Cau Vuot Tram 2"));
        busStop53.add(new BusStop(16, "Suoi Tien"));
        busStop53.add(new BusStop(17, "Vanh Dai DHQG TPHCM"));
        busStop53.add(new BusStop(18, "Ben Xe Buyt Khu A DHQG"));
        busStop53.add(new BusStop(19, "Nha Van Hoa Sinh Vien"));
        busStop53.add(new BusStop(20, "Dai Hoc Quoc Te"));
        busStop53.add(new BusStop(21, "Ho Da"));
        busStop53.add(new BusStop(22, "Nha Khach DHQG"));
        busStop53.add(new BusStop(23, "Vien Tai Nguyen Moi Truong"));
        busStop53.add(new BusStop(24, "KTX Khu B DHQG"));
        busStop53.add(new BusStop(25, "Ben Xe Buyt DH Quoc Gia"));

        // Bus Route 41 (Tuyen xe so 41)
        List<BusStop> busStop41 = new ArrayList<>();
        busStop41.add(new BusStop(1, "Ben Xe Mien Tay"));
        busStop41.add(new BusStop(2, "Benh Vien Trieu An"));
        busStop41.add(new BusStop(3, "Kinh Duong Vuong"));
        busStop41.add(new BusStop(4, "Aeon Mall Binh Tan"));
        busStop41.add(new BusStop(5, "Benh Vien Quoc Te"));
        busStop41.add(new BusStop(6, "Duong So 13"));
        busStop41.add(new BusStop(7, "Duong So 34"));
        busStop41.add(new BusStop(8, "Duong Ten Lua"));
        busStop41.add(new BusStop(9, "Dia Oc Phuoc Loc"));
        busStop41.add(new BusStop(10, "Ten Lua"));
        busStop41.add(new BusStop(11, "Duong 32"));
        busStop41.add(new BusStop(12, "Quan Com"));
        busStop41.add(new BusStop(13, "Le Dinh Can"));
        busStop41.add(new BusStop(14, "Ma Lo"));
        busStop41.add(new BusStop(15, "Cong Ty Huong So"));
        busStop41.add(new BusStop(16, "Benh Vien Binh Tan"));
        busStop41.add(new BusStop(17, "Phong Tiep Dan"));
        busStop41.add(new BusStop(18, "Cong Ty Dai Cang Phat"));
        busStop41.add(new BusStop(19, "Nga 3 Ao Doi"));
        busStop41.add(new BusStop(20, "Nga 3 Le Van Quoi"));
        busStop41.add(new BusStop(21, "Benh Vien Da Khoa Binh Tan"));
        busStop41.add(new BusStop(22, "Sieu Thi"));
        busStop41.add(new BusStop(23, "Binh Long"));
        busStop41.add(new BusStop(24, "Do Bi"));
        busStop41.add(new BusStop(25, "Cay Xang Binh Long"));
        busStop41.add(new BusStop(26, "Truong GTVT"));
        busStop41.add(new BusStop(27, "Nha Tho Tan Huong"));
        busStop41.add(new BusStop(28, "Cafe Suoi Reo"));
        busStop41.add(new BusStop(29, "Nha Tho Martino"));
        busStop41.add(new BusStop(30, "Tan Son Nhi"));
        busStop41.add(new BusStop(31, "Chung cu Go Dau"));
        busStop41.add(new BusStop(32, "Cafe Tino"));
        busStop41.add(new BusStop(33, "Le Dinh Tham"));
        busStop41.add(new BusStop(34, "Cuoi Cau Xeo"));
        busStop41.add(new BusStop(35, "Tram Xang"));
        busStop41.add(new BusStop(36, "Tram Duong So 27"));
        busStop41.add(new BusStop(37, "Tram Dau Le Trong Tan"));
        busStop41.add(new BusStop(38, "Truong Dai Hoc Cong Nghiep Thuc Pham"));
        busStop41.add(new BusStop(39, "Nguyen Huu Tien"));
        busStop41.add(new BusStop(40, "Tram Bo Bao Tan Thang"));
        busStop41.add(new BusStop(41, "Tram Tay Thanh"));
        busStop41.add(new BusStop(42, "Tram Truong Tieu Hoc Le Lai"));
        busStop41.add(new BusStop(43, "Cay Xang Tay Thanh"));
        busStop41.add(new BusStop(44, "Tram Cong KCN Tan Binh"));
        busStop41.add(new BusStop(45, "Khu Cong Nghiep Tan Binh"));
        busStop41.add(new BusStop(46, "Cau Tham Luong - Sieu Thi Thien Hoa"));
        busStop41.add(new BusStop(47, "Chua Vinh Phuoc"));
        busStop41.add(new BusStop(48, "Chua Lac Quang"));
        busStop41.add(new BusStop(49, "Bitis"));
        busStop41.add(new BusStop(50, "Ben Xe An Suong"));

        // Bus Route 32 (Tuyen xe so 32)
        List<BusStop> busStop32 = new ArrayList<>();
        busStop32.add(new BusStop(1, "Ben Xe Mien Tay"));
        busStop32.add(new BusStop(2, "Kinh Duong Vuong"));
        busStop32.add(new BusStop(3, "Cong Vien Phu Lam"));
        busStop32.add(new BusStop(4, "Ho Boi Phu Lam"));
        busStop32.add(new BusStop(5, "Cu Xa Phu Lam"));
        busStop32.add(new BusStop(6, "UBND Phuong 13"));
        busStop32.add(new BusStop(7, "Tan Hoa"));
        busStop32.add(new BusStop(8, "Cau Tan Hoa"));
        busStop32.add(new BusStop(9, "Cong Ty Det May Sai Gon"));
        busStop32.add(new BusStop(10, "Cong Ty Bao Bi Nhua Tan Tien"));
        busStop32.add(new BusStop(11, "Trung Tam Mua Sam"));
        busStop32.add(new BusStop(12, "Dau To Hieu"));
        busStop32.add(new BusStop(13, "Cuoi To Hieu"));
        busStop32.add(new BusStop(14, "Nguyen Ly"));
        busStop32.add(new BusStop(15, "Le Cao Bang"));
        busStop32.add(new BusStop(16, "Tran Thu Do"));
        busStop32.add(new BusStop(17, "Cho Phuong 18"));
        busStop32.add(new BusStop(18, "Pham Van Xao"));
        busStop32.add(new BusStop(19, "Truong GTVT"));
        busStop32.add(new BusStop(20, "Tram Cho Tan Huong"));
        busStop32.add(new BusStop(21, "Tram Y Te Phuong Tan Quy"));
        busStop32.add(new BusStop(22, "Tram Cafe Minh Thuy"));
        busStop32.add(new BusStop(23, "Tram Nga 4 Go Dau - Tan Quy"));
        busStop32.add(new BusStop(24, "Tram UBND Phuong Tan Quy"));
        busStop32.add(new BusStop(25, "Do Cong Truong"));
        busStop32.add(new BusStop(26, "Tram Tan Ky Tan Quy"));
        busStop32.add(new BusStop(27, "Tram Nha Tho Ho Toc Nguyen"));
        busStop32.add(new BusStop(28, "Showroom Oto"));
        busStop32.add(new BusStop(29, "Tram Xang"));
        busStop32.add(new BusStop(30, "Tram Duong So 27"));
        busStop32.add(new BusStop(31, "Tram Le Trong Tan"));
        busStop32.add(new BusStop(32, "Tram Dau Le Trong Tan"));
        busStop32.add(new BusStop(33, "Truong Dai Hoc Cong Nghiep Thuc Pham"));
        busStop32.add(new BusStop(34, "Le Trong Tan"));
        busStop32.add(new BusStop(35, "Trung Tam Van Hoa Quan Tan Phu"));
        busStop32.add(new BusStop(36, "Tram Bom"));
        busStop32.add(new BusStop(37, "Tram Cuoi D9"));
        busStop32.add(new BusStop(38, "Cay Xang Tay Thanh"));
        busStop32.add(new BusStop(39, "Tram Cong KCN Tan Binh"));
        busStop32.add(new BusStop(40, "Khu Cong Nghiep Tan Binh"));
        busStop32.add(new BusStop(41, "Chung cu Phuc Yen"));
        busStop32.add(new BusStop(42, "Nha Tho Hy Vong"));
        busStop32.add(new BusStop(43, "Nha May Hoa Chat Tan Binh"));
        busStop32.add(new BusStop(44, "Truong Cao Dang Du Lich"));
        busStop32.add(new BusStop(45, "Trung Tam Y Khoa Dan Sinh"));
        busStop32.add(new BusStop(46, "Cay Xang Anh Thu"));
        busStop32.add(new BusStop(47, "Nha Sach Phan Huy Ich"));
        busStop32.add(new BusStop(48, "Chua Linh Son Hai Hoi"));
        busStop32.add(new BusStop(49, "Nga Ba Nguyen Duy Cung"));
        busStop32.add(new BusStop(50, "Truong An Hoi"));
        busStop32.add(new BusStop(51, "Nga Ba Cay Tram"));
        busStop32.add(new BusStop(52, "Duong So 53"));
        busStop32.add(new BusStop(53, "Cong Ty Hue Phong"));
        busStop32.add(new BusStop(54, "Cho Thach Da"));
        busStop32.add(new BusStop(55, "Nha Tho Thach Da"));
        busStop32.add(new BusStop(56, "Trung Tam Van Hoa Quan Go Vap"));
        busStop32.add(new BusStop(57, "Truong Le Thi Hong Gam"));
        busStop32.add(new BusStop(58, "Nha Tho Hop An"));
        busStop32.add(new BusStop(59, "Nha Tho Ha Noi"));
        busStop32.add(new BusStop(60, "Nha Tho Trung Bac"));
        busStop32.add(new BusStop(61, "Truong THCS Ly Tu Trong"));
        busStop32.add(new BusStop(62, "Benh Vien Go Vap"));
        busStop32.add(new BusStop(63, "Nga Ba Le Hoang Phai"));
        busStop32.add(new BusStop(64, "Nga Tu An Nhon"));
        busStop32.add(new BusStop(65, "Ben Do"));
        busStop32.add(new BusStop(66, "Cau An Loc"));
        busStop32.add(new BusStop(67, "Nha Hang Ben Xua"));
        busStop32.add(new BusStop(68, "Nga Tu Ga"));
        busStop32.add(new BusStop(69, "Ngoc Lan"));
        busStop32.add(new BusStop(70, "Ben Xe Nga Tu Ga"));

        // Bus Route 16 (Tuyen xe so 16)
        List<BusStop> busStop16 = new ArrayList<>();
        busStop16.add(new BusStop(1, "Ben Xe Buyt Cho Lon B"));
        busStop16.add(new BusStop(2, "Cay Mai"));
        busStop16.add(new BusStop(3, "Lo Sieu"));
        busStop16.add(new BusStop(4, "Cay Go"));
        busStop16.add(new BusStop(5, "Tan Hoa"));
        busStop16.add(new BusStop(6, "Cau Ong Buong"));
        busStop16.add(new BusStop(7, "CoopMart Phu Lam"));
        busStop16.add(new BusStop(8, "Cho Phu Lam"));
        busStop16.add(new BusStop(9, "Truong Tieu Hoc Truong Cong Dinh"));
        busStop16.add(new BusStop(10, "Cho Tan Hoa Dong"));
        busStop16.add(new BusStop(11, "Ap Chien Luoc"));
        busStop16.add(new BusStop(12, "Phuong Binh Tri Dong"));
        busStop16.add(new BusStop(13, "Ao Ca Cay Bang"));
        busStop16.add(new BusStop(14, "My Hao"));
        busStop16.add(new BusStop(15, "Tan Khai"));
        busStop16.add(new BusStop(16, "Le Thai"));
        busStop16.add(new BusStop(17, "Lang Nuong Tay Nguyen"));
        busStop16.add(new BusStop(18, "Cho Binh Tri Dong Cu"));
        busStop16.add(new BusStop(19, "Quan Cau Xanh"));
        busStop16.add(new BusStop(20, "Dat Moi"));
        busStop16.add(new BusStop(21, "Truong Tieu Hoc Binh Tri 1"));
        busStop16.add(new BusStop(22, "Huong Lo 2"));
        busStop16.add(new BusStop(23, "Phong Tiep Dan"));
        busStop16.add(new BusStop(24, "Cong Ty Dai Cang Phat"));
        busStop16.add(new BusStop(25, "Nga 3 Ao Doi"));
        busStop16.add(new BusStop(26, "Ma Lo"));
        busStop16.add(new BusStop(27, "Cau Kinh Moi"));
        busStop16.add(new BusStop(28, "Uy Ban Phuong Binh Hung Hoa"));
        busStop16.add(new BusStop(29, "Nghia Trang Binh Hung Hoa"));
        busStop16.add(new BusStop(30, "Tram Binh Long"));
        busStop16.add(new BusStop(31, "Truong Tieu Hoc Tan Quy"));
        busStop16.add(new BusStop(32, "Sieu Thi Aeon"));
        busStop16.add(new BusStop(33, "Cho Son Ky"));
        busStop16.add(new BusStop(34, "Tram Bo Bao Tan Thang"));
        busStop16.add(new BusStop(35, "Nguyen Huu Tien"));
        busStop16.add(new BusStop(36, "Le Trong Tan"));
        busStop16.add(new BusStop(37, "Trung Tam Van Hoa Quan Tan Phu"));
        busStop16.add(new BusStop(38, "Luu Chi Hieu"));
        busStop16.add(new BusStop(39, "Truong Chinh"));
        busStop16.add(new BusStop(40, "Ben Xe Buyt Tan Phu"));

        listMap.put(busRoute8, busStop8);
        listMap.put(busRoute104, busStop104);
        listMap.put(busRoute56, busStop56);
        listMap.put(busRoute4, busStop4);
        listMap.put(busRoute53, busStop53);
        listMap.put(busRoute41, busStop41);
        listMap.put(busRoute32, busStop32);
        listMap.put(busRoute16, busStop16);

        return listMap;
    }

    // Inflate the menu to the Bus Route Layout:
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        getMenuInflater().inflate(R.menu.search_route_menu, menu);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchRoute = (SearchView) menu.findItem(R.id.search_route).getActionView();
        searchRoute.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchRoute.setMaxWidth(Integer.MAX_VALUE);

        searchRoute.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                busRouteAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                busRouteAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }

    // Handle the search view when back button is pressed
    @Override
    public void onBackPressed() {
        if (!searchRoute.isIconified()) {
            searchRoute.setIconified(true);
            return;
        }
        super.onBackPressed();
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