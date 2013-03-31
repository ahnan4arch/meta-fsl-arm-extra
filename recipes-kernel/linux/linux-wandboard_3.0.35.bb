# adapted from linux-imx.inc, copyright (C) 2012 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-wandboard.inc

PR = "${INC_PR}.1"

COMPATIBLE_MACHINE = "(mx6)"

# Wandboard branch
SRCREV = "64fee2d5ee42688a813a33b0d2f047f3dcc6b56f"
LOCALVERSION = "-wandboard+yocto"

SRC_URI_append = " \
"
