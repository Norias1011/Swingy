package com.swingy.View;

import com.swingy.Model.Hero;
import com.swingy.Model.Villain;
import com.swingy.Model.Position;
import com.swingy.Model.Artifact;


public interface GameView {
    void displayHeroStats(Hero hero);
    void updateMap(char[][] map, Position heroPos);
    void showBattleResult(boolean heroWon, Villain villain);
    void promptHeroCreation();
    void promptHeroSelection();
    void promptMovement();
    void showArtifactDrop(Artifact artifact);
    void showMessage(String message);
}
