package mk.finki.ukim.mk.lab.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ShoppingCart {

    public ShoppingCart(Long id, User user, LocalDateTime dateCreated, List<TicketOrder> ticketOrders) {
        this.id = id;
        this.user = user;
        this.dateCreated = dateCreated;
        this.ticketOrders = ticketOrders;
    }

    private Long id;

            private User user;

            private
            LocalDateTime dateCreated;

            private List<TicketOrder> ticketOrders;
}
