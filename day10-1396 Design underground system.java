class UndergroundSystem {

    class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    class Trip {
        int totalTime;
        int count;

        Trip(int totalTime, int count) {
            this.totalTime = totalTime;
            this.count = count;
        }
    }

    HashMap<Integer, CheckIn> checkInMap;
    HashMap<String, Trip> tripMap;

    public UndergroundSystem() {
        checkInMap = new HashMap<>();
        tripMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckIn in = checkInMap.get(id);

        String route = in.station + "-" + stationName;
        int travelTime = t - in.time;

        if (!tripMap.containsKey(route)) {
            tripMap.put(route, new Trip(travelTime, 1));
        } else {
            Trip trip = tripMap.get(route);
            trip.totalTime += travelTime;
            trip.count++;
        }

        checkInMap.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "-" + endStation;
        Trip trip = tripMap.get(route);

        return (double) trip.totalTime / trip.count;
    }
}
