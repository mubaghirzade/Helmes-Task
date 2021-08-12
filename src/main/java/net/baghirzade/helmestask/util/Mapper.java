package net.baghirzade.helmestask.util;

import net.baghirzade.helmestask.entity.RequestSector;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Mapper {

    public static List<RequestSector> sectorSetToRequestSectorList(Set<Integer> sectors, Long requestId) {
        List<RequestSector> data = new ArrayList<>();
        for(Integer sectorId: sectors){
            data.add(new RequestSector(requestId, sectorId));
        }

        return data;
    }
}
