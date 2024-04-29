package org.example.jeux_video.factory;

import org.example.jeux_video.entity.AbstractBuildingBuilder;
import org.example.jeux_video.entity.Building;

public abstract class BuildingFactory {
    public abstract Building createBuilding(AbstractBuildingBuilder builder);

}
