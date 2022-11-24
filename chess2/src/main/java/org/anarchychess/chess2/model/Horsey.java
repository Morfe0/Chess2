package org.anarchychess.chess2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Horsey extends ChessPiece{
    private final String name="Horsey";
    private final String cry="IIIII";
    private final String description="A fucking horsey";
    private Boolean alive=true;
}
