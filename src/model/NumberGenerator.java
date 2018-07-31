package model;

import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * The model.NumberGenerator class creates a
 * random integer between 65 and 90.
 *
 * @author Waswa Olunga
 */

public class NumberGenerator implements Subject {

	private static final int MAX_NUM_VALUE = 26;
	private static final int MIN_UPPERCASE_CHAR_VALUE = 65;

	private List<Observer> numberGeneratorObservers;


	public NumberGenerator() {
		this.numberGeneratorObservers = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer observer) {
		numberGeneratorObservers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		numberGeneratorObservers.remove(observer);
	}

	@Override
	public void notifyObservers(int num) {

		for(Observer observer: numberGeneratorObservers){
			observer.stateChanged(num);
		}
	}

	public void generateRandomUppercaseLetterAsciiValue(){
		notifyObservers(((int) Math.floor((Math.random() * MAX_NUM_VALUE))) + MIN_UPPERCASE_CHAR_VALUE);
	}

}