package com.illtamer.perpetua.sdk.entity.transfer.send;

import com.illtamer.perpetua.sdk.entity.TransferEntity;
import lombok.Data;

@Data
public class Text implements TransferEntity {

    private String text;

}
