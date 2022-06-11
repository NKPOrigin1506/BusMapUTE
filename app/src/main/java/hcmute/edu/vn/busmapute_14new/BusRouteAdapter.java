package hcmute.edu.vn.busmapute_14new;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class BusRouteAdapter extends BaseExpandableListAdapter {

    private List<BusRoute> busRoutesList;
    private Map<BusRoute, List<BusStop>> busStopList;

    public BusRouteAdapter(List<BusRoute> busRoutesList, Map<BusRoute, List<BusStop>> busStopList) {
        this.busRoutesList = busRoutesList;
        this.busStopList = busStopList;
    }

    @Override
    public int getGroupCount() {
        if (busRoutesList != null){
            return busRoutesList.size();
        }
        return 0;
    }

    @Override
    public int getChildrenCount(int i) {
        if (busRoutesList != null  && busStopList != null){
            return busStopList.get(busRoutesList.get(i)).size();
        }
        return 0;
    }

    @Override
    public Object getGroup(int i) {
        return busRoutesList.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return busStopList.get(busRoutesList.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        BusRoute busRoute = busRoutesList.get(i);
        return busRoute.getId();
    }

    @Override
    public long getChildId(int i, int i1) {
        BusStop busStop = busStopList.get(busRoutesList.get(i)).get(i1);
        return busStop.getId();
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item_group,viewGroup,false);
        }

        TextView tvBusRoute = view.findViewById(R.id.textViewBusRoute);
        BusRoute busRoute = busRoutesList.get(i);
        tvBusRoute.setText(busRoute.getBusRoute());

        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item,viewGroup,false);
        }

        TextView tvBusStop = view.findViewById(R.id.textViewBusStop);
        BusStop busStop = busStopList.get(busRoutesList.get(i)).get(i1);
        tvBusStop.setText(busStop.getBusStop());

        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
