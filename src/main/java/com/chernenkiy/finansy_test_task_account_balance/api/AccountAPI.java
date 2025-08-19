package com.chernenkiy.finansy_test_task_account_balance.api;

import com.chernenkiy.finansy_test_task_account_balance.entity.TransactionEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;

@Tag(name = "Account", description = "API для управления балансом счета")
@RequestMapping(value = "/api/v1/accounts")
public interface AccountAPI {

    @Operation(summary = "Создать счет",
            description = "Создает новый счет для пользователя",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Счет успешно создан",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = String.class))
                    )
            }
    )
    @PostMapping("/{name}")
    default ResponseEntity<String> createAccount(
            @Parameter(description = "Имя счета")
            @PathVariable(value = "name") String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Operation(summary = "Выполнить транзакцию",
            description = "Выполняет балансовую операцию для указанного счета",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Транзакция выполнена",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = String.class))
                    ),
                    @ApiResponse(responseCode = "404",
                            description = "Аккаунт с таким именем не существует",
                            content = @Content()),
                    @ApiResponse(responseCode = "409", description = "Недостаточно средств",
                            content = @Content()),
                    @ApiResponse(responseCode = "400", description = "Отправлен некорректный запрос",
                            content = @Content())
            }
    )
    @PostMapping("/{name}/transactions")
    default ResponseEntity<String> addTransaction(
            @Parameter(description = "Имя счета")
            @PathVariable(value = "name") String name,
            @Valid @RequestBody TransactionEntity transactionEntity) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Operation(summary = "Получить баланс",
            description = "Получить баланс для указанного счета",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Баланс успешно получен",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = BigDecimal.class))
                    ),
                    @ApiResponse(responseCode = "404", description = "Аккаунт с таким именем не найден",
                            content = @Content())
            }
    )
    @GetMapping("/{name}/balance")
    default ResponseEntity<BigDecimal> getBalance(
            @Parameter(description = "Имя счета")
            @PathVariable(value = "name") String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Operation(summary = "Получить список транзакций",
            description = "Получить список всех транзакций для указанного счета",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Список транзакций получен",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    array = @ArraySchema(schema = @Schema(implementation = TransactionEntity.class))
                            )
                    ),
                    @ApiResponse(responseCode = "404", description = "Аккаунт с таким именем не найден",
                            content = @Content())
            }
    )
    @GetMapping("/{name}/transactions")
    default ResponseEntity<List<TransactionEntity>> getTransactions(
            @Parameter(description = "Имя счета")
            @PathVariable(name = "name") String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
