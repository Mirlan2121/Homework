package model;

import java.util.List;

public interface Lottery {
    LotteryModel createLottery(LotteryModel lotteryModel);
    PrizesModel createPrize(LotteryModel lotteryModel ,PrizesModel prizesModel);
    TicketModel createTickets(List<TicketModel> ticketModels);

    boolean sellTicket(Integer ticketModel);

    boolean chooseWinner(Integer lottery, Integer prizeId);


}
