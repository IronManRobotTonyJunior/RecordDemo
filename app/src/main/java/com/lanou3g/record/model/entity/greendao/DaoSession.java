package com.lanou3g.record.model.entity.greendao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig recommendEntityDaoConfig;

    private final RecommendEntityDao recommendEntityDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        recommendEntityDaoConfig = daoConfigMap.get(RecommendEntityDao.class).clone();
        recommendEntityDaoConfig.initIdentityScope(type);

        recommendEntityDao = new RecommendEntityDao(recommendEntityDaoConfig, this);

        registerDao(RecommendEntity.class, recommendEntityDao);
    }
    
    public void clear() {
        recommendEntityDaoConfig.getIdentityScope().clear();
    }

    public RecommendEntityDao getRecommendEntityDao() {
        return recommendEntityDao;
    }

}
