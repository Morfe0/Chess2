package org.anarchychess.chess2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ChessPiece {
    private final String name="";
    private final String cry="";
    private final String description="";
    private Boolean alive=true;
}
