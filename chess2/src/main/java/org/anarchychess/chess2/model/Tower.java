package org.anarchychess.chess2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tower extends ChessPiece{
    private final String name="Tower";
    private final String cry="STFUTFUTFUTFU";
    private final String description="BIG BLACK TOWER";
    private Boolean alive=true;
}
