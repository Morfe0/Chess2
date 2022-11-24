package org.anarchychess.chess2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Queen extends ChessPiece{
    private final String name="Queen";
    private final String cry="WooOOooOOoo";
    private final String description="transparent";
    private Boolean alive=true;
}
