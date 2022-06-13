package dtos;

import entities.Show;

import java.util.ArrayList;
import java.util.List;

public class ShowDTO {
    private long id;
    private String name;
    private int duration;
    private String location;
    private String startDate;
    private String startTime;

    public ShowDTO(Show s) {
        this.id = s.getId();
        this.name = s.getName();
        this.duration = s.getDuration();
        this.location = s.getLocation();
        this.startDate = s.getStartDate();
        this.startTime = s.getStartTime();
    }

    public ShowDTO(long id, String name, int duration, String location, String startDate, String startTime) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.location = location;
        this.startDate = startDate;
        this.startTime = startTime;
    }

    public static List<ShowDTO> getDtos(List<Show> s){
        List<ShowDTO> sdtos = new ArrayList<>();
        s.forEach(sh->sdtos.add(new ShowDTO(sh)));
        return sdtos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}
