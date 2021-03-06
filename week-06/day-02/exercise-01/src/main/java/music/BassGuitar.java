package main.java.music;

public class BassGuitar extends StringedInstrument {
  String sound = "Duum-duum-duum";

  public BassGuitar() {
    name = "BassGuitar";
    numberOfStrings = 4;
  }

  public BassGuitar(int i) {
    name = "BassGuitar";
    numberOfStrings = i;
  }

  public void play() {
    System.out.printf(FORMAT_FOR_PLAY, name, numberOfStrings, sound);
  }
}
