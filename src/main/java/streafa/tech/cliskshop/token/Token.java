package streafa.tech.cliskshop.token;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "token")
public class Token {

    @Id
    private Long id = 1l;
    private String token;
    private int year;
    private int dayOfYearStartValid;
    private int dayOfYearExpiration;

    public Token(Long id, String token, int year, int dayOfYearStartValid, int dayOfYearExpiration) {
        this.id = id;
        this.token = token;
        this.year = year;
        this.dayOfYearStartValid = dayOfYearStartValid;
        this.dayOfYearExpiration = dayOfYearExpiration;
    }

    public Token() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDayOfYearStartValid() {
        return dayOfYearStartValid;
    }

    public void setDayOfYearStartValid(int dayOfYearStartValid) {
        this.dayOfYearStartValid = dayOfYearStartValid;
    }

    public int getDayOfYearExpiration() {
        return dayOfYearExpiration;
    }

    public void setDayOfYearExpiration(int dayOfYearExpiration) {
        this.dayOfYearExpiration = dayOfYearExpiration;
    }

    @Override
    public String toString() {
        return "Token{" +
                "id=" + id +
                ", token='" + token + '\'' +
                ", year=" + year +
                ", dayOfYearStartValid=" + dayOfYearStartValid +
                ", dayOfYearExpiration=" + dayOfYearExpiration +
                '}';
    }
}
