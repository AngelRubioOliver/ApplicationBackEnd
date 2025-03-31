package com.tascaAndreu.tascaAndreu.domain.ports.out;

import com.hexagonal.tasks.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort
{
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
