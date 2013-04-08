include recipes-core/images/core-image-base.bb

IMAGE_FEATURES += "debug-tweaks"

SOC_EXTRA_IMAGE_FEATURES ?= "tools-testapps"

# mesa-demos is currently broken when building with other GL library
# so we avoid it by now and tools-testapps includes it.
SOC_EXTRA_IMAGE_FEATURES_mx5 = ""
SOC_EXTRA_IMAGE_FEATURES_mx6 = ""

# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    ${SOC_EXTRA_IMAGE_FEATURES} \
    nfs-server \
    tools-debug \
    tools-profile \
"

GSTREAMER_EXTRA_INSTALL = " \
    gst-plugins-good-video4linux2 \
    gst-plugins-good-rtp \
    gst-plugins-good-rtpmanager \
    gst-plugins-good-udp \
"    

IMAGE_INSTALL += " \
    packagegroup-fsl-gstreamer \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-tools-benchmark \
    ${GSTREAMER_EXTRA_INSTALL} \
"

export IMAGE_BASENAME = "video-image-test"
