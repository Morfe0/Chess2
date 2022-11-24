package org.anarchychess.chess2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class King extends ChessPiece{
    private final String name="King";
    private final String cry="WINEEEE";
    private final String description="useless";
    private Boolean alive=true;
}
