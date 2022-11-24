package org.anarchychess.chess2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bishop extends ChessPiece{
    private final String name="Bishop";
    private final String cry="MMMMMMM come here little boy";
    private final String description="tall and nasty";
    private Boolean alive=true;
}
