package com.jyotiprakash.service;

import com.jyotiprakash.domain.PlanType;
import com.jyotiprakash.modal.Subscription;
import com.jyotiprakash.modal.User;

public interface SubscriptionService {
    Subscription createSubscription(User user);
    Subscription getUserSubscription(Long userId) throws Exception;
    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}
