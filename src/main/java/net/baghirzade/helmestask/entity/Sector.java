package net.baghirzade.helmestask.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Sector {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String value;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private Sector parent;

    private Integer margin;

    @OneToMany(mappedBy = "parent", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Sector> subSectors;

    public Sector() {

    }

    public Sector(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Sector getParent() {
        return parent;
    }

    public void setParent(Sector parent) {
        this.parent = parent;
    }

    public Integer getMargin() {
        return margin;
    }

    public void setMargin(Integer margin) {
        this.margin = margin;
    }

    public Set<Sector> getSubSectors() {
        return subSectors;
    }

    public void setSubSectors(Set<Sector> subSectors) {
        this.subSectors = subSectors;
    }
}
