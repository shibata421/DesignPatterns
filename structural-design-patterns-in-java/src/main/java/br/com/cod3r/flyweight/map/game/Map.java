package br.com.cod3r.flyweight.map.game;

import java.util.Random;

import br.com.cod3r.flyweight.map.model.Pixel;
import br.com.cod3r.flyweight.map.model.PixelTypeFactory;

public class Map {
	private static final Integer TRIES = 10;
	private static final Integer MAP_ROWS = 10;
	private static final Integer MAP_COLUMNS = 10;

	private Pixel[][] map;
	private Integer triesRemaining;
	private PixelTypeFactory factory;

	public Map() {
		factory = PixelTypeFactory.getInstance();
		map = createMap();
		triesRemaining = TRIES;
	}

	private Pixel[][] createMap() {
		Pixel[][] map = new Pixel[MAP_ROWS][MAP_COLUMNS];
		for (int row = 0; row < MAP_ROWS; row++) {
			for (int column = 0; column < MAP_COLUMNS; column++) {
				int pix = sort();
				Pixel pixel = null;
				switch (pix) {
				case 0:
					pixel = new Pixel(factory.getPixelType('$', 100), false);
					break;
				case 1:
					pixel = new Pixel(factory.getPixelType('%', 50), false);
					break;
				case 2:
					pixel = new Pixel(factory.getPixelType('X', -50), false);
					break;
				case 3:
					pixel = new Pixel(factory.getPixelType('@', -100), false);
					break;
				default:
					pixel = new Pixel(factory.getPixelType(' ', 0), false);
					break;
				}
				map[row][column] = pixel;
			}
		}
		return map;
	}

	public void drawMap() {
		System.out.println("----------------");
		System.out.print(" ");
		
		for (int title = 0; title < MAP_COLUMNS; title++) {
			System.out.print(" " + title);			
		}
		
		for (int row = 0; row < MAP_ROWS; row++) {
			System.out.print("\n" + row);
			for (int column = 0; column < map[row].length; column++) {
				Pixel cell = map[row][column];
				System.out.print(' ');
				System.out.print(cell.isOpened() ? cell.getType().getCharacter() : '#');
			}
		}
		
		System.out.println(String.format("\nYou have %d tries left", triesRemaining));
	}

	public Integer openCell(String coord) {
		if (coord.length() != 2) {
			return 0;
		}
		
		Integer row = null;
		Integer column = null;
		
		try {
			row = Integer.valueOf(coord.substring(0, 1));
			column = Integer.valueOf(coord.substring(1, 2));
		} catch (NumberFormatException e) {
			return 0;
		}
		
		Pixel choosen = map[row][column];
		if (!choosen.isOpened()) {
			choosen.setOpened(true);
			triesRemaining--;
			return choosen.getType().getTreasureReward();
		}
		return 0;
	}

	public boolean isGameOver() {
		return triesRemaining == 0;
	}

	private int sort() {
		Random r = new Random();
		return r.nextInt(10);
	}
}
