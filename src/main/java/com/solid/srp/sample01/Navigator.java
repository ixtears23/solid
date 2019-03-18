package com.solid.srp.sample01;

public class Navigator {

    private NextPositionResolver nextPositionResolver;
    private PositionRepairer positionRepairer;
    
    public Navigator(NextPositionResolver nextStepResolver,PositionRepairer positionRepairer) {
        this.nextPositionResolver = nextStepResolver;
        this.positionRepairer = positionRepairer;
    }
    
    public Position navigate(Position position, Direction direction) {
        Position nextPosition =  nextPositionResolver.resolve(position,direction);
        Position fixedPosition = positionRepairer.fix(nextPosition);
        return fixedPosition;
    }
}
