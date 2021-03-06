public class Hero extends Character {
  int moveCounter;

  Hero() {
    level = 1;
    maxHp = 20 + 3 * Dice.rollDice6();
    hp = maxHp;
    dp = 2 * Dice.rollDice6();
    sp = 5 + Dice.rollDice6();
    canMove = true;
    hasKey = false;
    moveCounter = 0;
  }

  void moveHeroUp() {
    if (posY >= 72 && Map.isFloor(posX / 72, posY / 72 - 1)) {
      posY -= 72;
    }
    image = "assets/hero-up.png";
    moveCounter++;
  }

  void moveHeroDown() {
    if (posY < 648 && Map.isFloor(posX / 72, posY / 72 + 1)) {
      posY += 72;
    }
    image = "assets/hero-down.png";
    moveCounter++;
  }

  void moveHeroLeft() {
    if (posX >= 72 && Map.isFloor(posX / 72 - 1, posY / 72)) {
      posX -=72;
    }
    image = "assets/hero-left.png";
    moveCounter++;
  }

  void moveHeroRight() {
    if (posX < 648 && Map.isFloor(posX / 72 + 1, posY / 72)) {
      posX +=72;
    }
    image = "assets/hero-right.png";
    moveCounter++;
  }

  void levelUp() {
    level++;
    maxHp += Dice.rollDice6();
    dp += Dice.rollDice6();
    sp += Dice.rollDice6();
    image = "assets/hero-levelup.png";
  }

  void enterNextLevel() {
    int i = Dice.rollDice10();
    if (i < 6) {
      hp += maxHp / 10;
    } else if (i < 10) {
      hp += maxHp / 3;
    } else {
      hp = maxHp;
    }
    if (hp > maxHp) {
      hp = maxHp;
    }
  }
}
