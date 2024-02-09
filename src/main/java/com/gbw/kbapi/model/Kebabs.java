package com.gbw.kbapi.model;

import com.gbw.kbapi.enums.Bread;
import com.gbw.kbapi.enums.Meat;
import com.gbw.kbapi.enums.Sauce;
import com.gbw.kbapi.enums.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Kebabs {
    private int id;
    private Meat meat;
    private Bread bread;
    private Sauce sauce;
    private boolean salad;
    private Size size;
}
