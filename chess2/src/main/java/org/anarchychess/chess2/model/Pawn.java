package org.anarchychess.chess2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pawn extends ChessPiece{
    private final String name="Pawn";
    private final String cry="Stop touching me, PLEASE!!!";
    private final String description="small and cute";
    private Boolean alive=true;
}
