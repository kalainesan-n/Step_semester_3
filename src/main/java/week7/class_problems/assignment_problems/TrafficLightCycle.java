public class TrafficLightCycle {
    static class TrafficLight { private String color = "RED"; private final String id; TrafficLight(String id) { this.id = id; } void next() { color = color.equals("RED") ? "GREEN" : color.equals("GREEN") ? "YELLOW" : "RED"; } String getColor() { return color; } }
    public static void main(String[] args) { TrafficLight t = new TrafficLight("TL-9"); System.out.println(t.getColor()); t.next(); System.out.println(t.getColor()); t.next(); System.out.println(t.getColor()); t.next(); System.out.println(t.getColor()); }
}
