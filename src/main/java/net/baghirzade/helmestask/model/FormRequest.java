package net.baghirzade.helmestask.model;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class FormRequest {

    @NotNull
    private String name;

    @NotNull
    private Boolean agreement;

    @NotNull
    private Set<Integer> sectors;

}
