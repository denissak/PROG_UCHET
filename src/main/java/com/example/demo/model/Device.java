package com.example.demo.model;



import javax.persistence.*;

@Entity
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_device")
    private Integer id;
    @OneToOne(cascade = CascadeType.ALL)
    private Computer computers;
    private String namePC;
    private String numberRoom;
    private String numberInv;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Computer getComputers() {
        return computers;
    }

    public void setComputers(Computer computers) {
        this.computers = computers;
    }

    public String getNamePC() {
        return namePC;
    }

    public void setNamePC(String namePC) {
        this.namePC = namePC;
    }

    public String getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(String numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String getNumberInv() {
        return numberInv;
    }

    public void setNumberInv(String numberInv) {
        this.numberInv = numberInv;
    }

/*   public Device(Computer computers, String namePC, String numberRoom, String numberInv) {
        this.computers = computers;
        this.namePC = namePC;
        this.numberRoom = numberRoom;
        this.numberInv = numberInv;
    }*/
/*    public Device (){}
    public Device (Computer computers) {
        this.computers = computers;
    }*/

/*    public void setComputers(Computer computers) {
        this.computers = computers;
    }

    public Computer getComputers() {
        return computers;
    }


    public void setNamePC(String namePC) {
        this.namePC = namePC;
    }

    public String getNamePC() {
        return namePC;
    }

    public void setNumberRoom(String numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String getNumberRoom() {
        return numberRoom;
    }

    public void setNumberInv(String numberInv) {
        this.numberInv = numberInv;
    }

    public String getNumberInv() {
        return numberInv;
    }

    public String toString ()
    {
        return computers.getComputer() + " " + namePC + " " + numberRoom + " " + numberInv;
    }*/
}