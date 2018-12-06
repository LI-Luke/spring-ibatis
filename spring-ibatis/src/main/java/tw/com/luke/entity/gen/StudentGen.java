package tw.com.luke.entity.gen;

import java.io.Serializable;
import java.util.Date;

public abstract class StudentGen implements Serializable {
    /**
     * id INTEGER(10)
     */
    private Integer id;

    @Override
	public String toString() {
		return "StudentGen [id=" + id + ", name=" + name + ", bdate=" + bdate + ", tel=" + tel + "]";
	}

	/**
     * name NCHAR(20)
     */
    private String name;

    /**
     * bdate DATE(10)
     */
    private Date bdate;

    /**
     * tel CHAR(20)
     */
    private String tel;

    private static final long serialVersionUID = 1L;

    /**
     * Column name: id<br>
     * Column type: INTEGER(10)<br>
     * @return the value of student.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Column name: id<br>
     * Column type: INTEGER(10)<br>
     * @param id the value for student.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Column name: name<br>
     * Column type: NCHAR(20)<br>
     * @return the value of student.name
     */
    public String getName() {
        return name;
    }

    /**
     * Column name: name<br>
     * Column type: NCHAR(20)<br>
     * @param name the value for student.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * Column name: bdate<br>
     * Column type: DATE(10)<br>
     * @return the value of student.bdate
     */
    public Date getBdate() {
        return bdate;
    }

    /**
     * Column name: bdate<br>
     * Column type: DATE(10)<br>
     * @param bdate the value for student.bdate
     */
    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    /**
     * Column name: tel<br>
     * Column type: CHAR(20)<br>
     * @return the value of student.tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * Column name: tel<br>
     * Column type: CHAR(20)<br>
     * @param tel the value for student.tel
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }
}