package org.example.jeux_video.factory;

import org.example.jeux_video.entity.AbstractBuildingBuilder;
import org.example.jeux_video.entity.Building;
import org.example.jeux_video.factory.BuildingFactory;

public class CastleFactory extends BuildingFactory {

    @Override
    public Building createBuilding(AbstractBuildingBuilder castleBuilder) {
        return castleBuilder.build();
    }
}
