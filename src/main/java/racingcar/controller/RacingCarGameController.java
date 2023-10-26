package racingcar.controller;

import racingcar.model.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingCarGameController {

    private final InputView inputView;
    private final OutputView outputView;

    public RacingCarGameController(InputView inputView, OutputView outputView){
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run(){
        Cars cars = Cars.makeCarList(inputView.readCarNames());
        moveCars(cars);

    }

    private void moveCars(Cars cars){
        int count = inputView.readMoveCount();
    }
}