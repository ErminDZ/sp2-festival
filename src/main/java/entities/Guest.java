package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Guest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    private String name;
    private int phone;
    private String email;
    private String status;

    public Guest() {
    }

    public Guest(String name, int phone, String email, String status,Show show,Festival festival) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.status = status;
        this.shows = null;
        this.festival = festival;
    }

    @ManyToMany(mappedBy = "guests", cascade = CascadeType.PERSIST)
    private List<Show> shows = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Festival festival;

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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
        if (!festival.getGuests().contains(this)){
            festival.getGuests().add(this);
        }
    }
}
