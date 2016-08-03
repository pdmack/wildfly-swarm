/**
 * Copyright 2015-2016 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wildfly.swarm.cdi;

import javax.inject.Singleton;

import org.wildfly.swarm.config.Weld;
import org.wildfly.swarm.spi.api.DefaultFraction;
import org.wildfly.swarm.spi.api.Fraction;
import org.wildfly.swarm.spi.api.annotations.DeploymentModule;
import org.wildfly.swarm.spi.api.annotations.MarshalDMR;
import org.wildfly.swarm.spi.api.annotations.WildFlyExtension;

/**
 * @author Bob McWhirter
 */
@DefaultFraction
@Singleton
@WildFlyExtension(module = "org.jboss.as.weld")
@MarshalDMR
@DeploymentModule(name = "org.wildfly.swarm.cdi", slot = "ext", metaInf = DeploymentModule.MetaInfDisposition.IMPORT)
public class CDIFraction extends Weld<CDIFraction> implements Fraction {

    public CDIFraction() {
    }

}
