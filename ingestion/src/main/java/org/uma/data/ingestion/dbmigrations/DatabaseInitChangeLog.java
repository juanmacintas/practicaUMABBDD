package org.uma.data.ingestion.dbmigrations;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;

import org.uma.data.ingestion.entity.Categorization;
import org.uma.data.ingestion.entity.Category;
import org.uma.data.ingestion.entity.Cycle;
import org.uma.data.ingestion.entity.Event;
import org.uma.data.ingestion.entity.EventHistory;
import org.uma.data.ingestion.entity.Label;
import org.uma.data.ingestion.entity.Permission;
import org.uma.data.ingestion.entity.Rol;
import org.uma.data.ingestion.entity.Users;
import org.uma.data.ingestion.repository.CycleRepository;
import org.uma.data.ingestion.repository.EventHistoryRepository;
import org.uma.data.ingestion.repository.LabelRepository;
import org.uma.data.ingestion.repository.UsersRepository;

@ChangeLog(order = "001")
public class DatabaseInitChangeLog {
    
    @ChangeSet(order = "001", id = "init_users", author = "restalion")
    public void initUsers(UsersRepository usersRepository) {
        usersRepository.save(Users.builder()
            .userName("User 1")
            .userSurname("Usuario")
            .userStatus("Active")
            .rol(Rol.builder().name("Role 1").build())
            .permission(Permission.builder().name("Permission 1").build())
            .history(Arrays.asList("AAAA", "BBBB", "CCCC"))
            .client("Client A")
            .build());

        usersRepository.save(Users.builder()
            .userName("User 2")
            .userSurname("Usuario")
            .userStatus("Active")
            .rol(Rol.builder().name("Role 2").build())
            .permission(Permission.builder().name("Permission 2").build())
            .history(Arrays.asList("AAAA", "BBBB"))
            .client("Client A")
            .build());

        usersRepository.save(Users.builder()
            .userName("User 3")
            .userSurname("Usuario")
            .userStatus("Active")
            .rol(Rol.builder().name("Role 3").build())
            .permission(Permission.builder().name("Permission 3").build())
            .history(Arrays.asList("BBBB", "CCCC"))
            .client("Client B")
            .build());
    }

    @ChangeSet(order = "002", id = "event_history", author = "restalion")
    public void initEventHistory(EventHistoryRepository eventHistoryRepository) {
        eventHistoryRepository.save(EventHistory.builder()
            .datasetId(1)
            .endDate(Date.from(Instant.now()))
            .event(Event.builder().name("NEW").build())
            .lastModified(Date.from(Instant.now()))
            .startDate(Date.from(Instant.now()))
            .status("OK")
            .build());

        eventHistoryRepository.save(EventHistory.builder()
            .datasetId(1)
            .endDate(Date.from(Instant.now()))
            .event(Event.builder().name("REMOVE").build())
            .lastModified(Date.from(Instant.now()))
            .startDate(Date.from(Instant.now()))
            .status("REMOVED")
            .build());

        eventHistoryRepository.save(EventHistory.builder()
            .datasetId(2)
            .endDate(Date.from(Instant.now()))
            .event(Event.builder().name("NEW").build())
            .lastModified(Date.from(Instant.now()))
            .startDate(Date.from(Instant.now()))
            .status("OK")
            .build());
    }

    @ChangeSet(order = "003", id = "cycle", author = "restalion")
    public void initEventHistory(CycleRepository cycleRepository) {
        cycleRepository.save(Cycle.builder()
            .categorization(Arrays.asList(
                Categorization.builder()
                    .category(Category.builder()
                        .description("Professional Services expenses")
                        .name("Professional Services")
                        .threshold(2.3)
                        .build())
                    .cleanId(1)
                    .datasetId(1)
                    .defaultCategoryId(1)
                    .ownerId(1)
                    .priority(12)
                    .spend(345.32)
                    .threshold(1.4)
                    .vendor("Air France")
                    .build(),
                Categorization.builder()
                    .category(Category.builder()
                        .description("Human Resources expenses")
                        .name("Human Resources")
                        .threshold(4.3)
                        .build())
                    .cleanId(34)
                    .datasetId(1)
                    .defaultCategoryId(23)
                    .ownerId(1)
                    .priority(2)
                    .spend(1234.32)
                    .threshold(1.4)
                    .vendor("Delta")
                    .build()))
            .datasetId(1)
            .history(Arrays.asList("AAAA", "BBBB", "CCCC"))
            .iteration(1)
            .lastCycle(Boolean.FALSE)
            .build());

            cycleRepository.save(Cycle.builder()
            .categorization(Arrays.asList(
                Categorization.builder()
                    .category(Category.builder()
                        .description("Financial Consulting expenses")
                        .name("Financial Consulting")
                        .threshold(4.3)
                        .build())
                    .cleanId(2)
                    .datasetId(1)
                    .defaultCategoryId(4)
                    .ownerId(1)
                    .priority(25)
                    .spend(123124.45)
                    .threshold(6.4)
                    .vendor("Delta")
                    .build(),
                Categorization.builder()
                    .category(Category.builder()
                        .description("Advertising expenses")
                        .name("Advertising Resources")
                        .threshold(3.3)
                        .build())
                    .cleanId(67)
                    .datasetId(1)
                    .defaultCategoryId(56)
                    .ownerId(1)
                    .priority(4)
                    .spend(5463.12)
                    .threshold(1.4)
                    .vendor("Shouth West Airlines")
                    .build()))
            .datasetId(1)
            .history(Arrays.asList("BBBB", "CCCC"))
            .iteration(2)
            .lastCycle(Boolean.TRUE)
            .build());
    }

    @ChangeSet(order = "004", id = "label", author = "restalion")
    public void initLabel(LabelRepository labelRepository) {
        labelRepository.save(Label.builder()
            .categoryId(1)
            .cleanId(1)
            .cycleId(1)
            .datasetId(1)
            .build());

        labelRepository.save(Label.builder()
            .categoryId(2)
            .cleanId(3)
            .cycleId(2)
            .datasetId(1)
            .build());

        labelRepository.save(Label.builder()
            .categoryId(34)
            .cleanId(41)
            .cycleId(15)
            .datasetId(1)
            .build());

        labelRepository.save(Label.builder()
            .categoryId(2)
            .cleanId(31)
            .cycleId(24)
            .datasetId(3)
            .build());
    }
}
