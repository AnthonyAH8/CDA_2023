package org.example.jeux_video.factory;

import org.example.jeux_video.entity.AbstractBuildingBuilder;
import org.example.jeux_video.entity.Building;

public class CaserneFactory extends BuildingFactory{
    @Override
    public Building createBuilding(AbstractBuildingBuilder casernebuilder) {
        return casernebuilder.build();
    }
}
