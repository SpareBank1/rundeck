/*
 * Copyright 2016 SimplifyOps, Inc. (http://simplifyops.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.rundeck.plugin.scm.git.config

import com.dtolabs.rundeck.core.plugins.configuration.Property
import com.dtolabs.rundeck.plugins.descriptions.PluginProperty

/**
 * Created by greg on 10/13/15.
 */
class Export extends Common {

    @PluginProperty(
            title = 'Committer Name',
            description = '''Name of committer/author of changes.

Can be set to `${user.firstName} ${user.lastName}` or
`${user.fullName}` to expand as the name
of the committing user.''',
            defaultValue = '${user.fullName}',
            required = true
    )
    String committerName

    @PluginProperty(
            title = "Committer Email",
            description = '''Email of committer/author of changes.

Can be set to `${user.email}` to expand
as the email of the committing user''',
            defaultValue = '${user.email}',
            required = true

    )
    String committerEmail


}
