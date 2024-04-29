package org.example.jeux_video.factory;

import org.example.jeux_video.entity.AbstractBuildingBuilder;
import org.example.jeux_video.entity.Building;

public class ForgesFactory extends BuildingFactory{
    @Override
    public Building createBuilding(AbstractBuildingBuilder forgesBuilder) {
        return forgesBuilder.build();
    }
}
