package net.baghirzade.helmestask.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
public class RequestSector {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "request_id", referencedColumnName = "id")
    private Request request;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "sector_id", referencedColumnName = "id")
    private Sector sector;

    public RequestSector(Long requestId, Integer sectorId) {
        this.request = new Request(requestId);
        this.sector = new Sector(sectorId);
    }
}
